package org.medicode.medicodeback.infrastructure.adapters.out.persistence;

import org.medicode.medicodeback.application.port.out.DoctorRepositoryPort;
import org.medicode.medicodeback.domain.model.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DoctorRepositoryAdapter implements DoctorRepositoryPort {

    private final SpringDataDoctorRepository repository;
    private final DoctorMapper mapper;

    @Override
    public Doctor guardar(Doctor doctor) {
        DoctorEntity entity = mapper.toEntity(doctor);
        DoctorEntity savedEntity = repository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}