package org.medicode.medicodeback.infrastructure.adapters.out.persistence.adapter;

import lombok.RequiredArgsConstructor;
import org.medicode.medicodeback.application.port.out.DoctorRepositoryPort;
import org.medicode.medicodeback.domain.model.Doctor;
import org.medicode.medicodeback.infrastructure.adapters.out.persistence.entity.JpaDoctorEntity;
import org.medicode.medicodeback.infrastructure.adapters.out.persistence.mapper.DoctorMapper;
import org.medicode.medicodeback.infrastructure.adapters.out.persistence.repository.SpringDataDoctorRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DoctorRepositoryAdapter implements DoctorRepositoryPort {
    private final SpringDataDoctorRepository springDataRepository;
    private final DoctorMapper mapper;

    @Override
    public Page<Doctor> findAll(Pageable pageable){
        return springDataRepository.findAll(pageable).map(mapper::toDomain);
    }

    @Override
    public Optional<Doctor> findById(Integer id){
        return springDataRepository.findById(id).map(mapper::toDomain);
    }

    @Override
    public Doctor save(Doctor doctor) {
        JpaDoctorEntity entity = mapper.toEntity(doctor);
        JpaDoctorEntity savedEntity = springDataRepository.save(entity);
        return mapper.toDomain(savedEntity);
    }

    @Override
    public void deleteById(Integer id){
        springDataRepository.deleteById(id);
    }
}
