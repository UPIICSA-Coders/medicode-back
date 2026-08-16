package org.medicode.medicodeback.infrastructure.adapters.out.persistence.adapter;

import lombok.RequiredArgsConstructor;
import org.medicode.medicodeback.application.port.out.ReceptionistRepositoryPort;
import org.medicode.medicodeback.domain.model.Receptionist;
import org.medicode.medicodeback.infrastructure.adapters.out.persistence.entity.JpaReceptionistEntity;
import org.medicode.medicodeback.infrastructure.adapters.out.persistence.mapper.ReceptionistMapper;
import org.medicode.medicodeback.infrastructure.adapters.out.persistence.repository.SpringDataReceptionistRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReceptionistRepositoryAdapter implements ReceptionistRepositoryPort {

    private final SpringDataReceptionistRepository repository;
    private final ReceptionistMapper mapper;

    @Override
    public Page<Receptionist> findAll(Pageable pageable) {
        Page<JpaReceptionistEntity> entityPage = repository.findAll(pageable);
        return entityPage.map(mapper::toDomain);
    }

    @Override
    public Receptionist save(Receptionist receptionist) {
        JpaReceptionistEntity entity = mapper.toEntity(receptionist);
        JpaReceptionistEntity savedEntity = repository.save(entity);
        return mapper.toDomain(savedEntity);
    }
}