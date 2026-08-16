package org.medicode.medicodeback.infrastructure.adapters.out.persistence.mapper;

import org.medicode.medicodeback.domain.model.Receptionist;
import org.medicode.medicodeback.infrastructure.adapters.out.persistence.entity.JpaReceptionistEntity;
import org.springframework.stereotype.Component;

@Component
public class ReceptionistMapper {
    public JpaReceptionistEntity toEntity(Receptionist receptionist) {
        if (receptionist == null) {
            return null;
        }
        JpaReceptionistEntity entity = new JpaReceptionistEntity();
        entity.setIdReceptionist(receptionist.getIdReceptionist());
        entity.setUserId(receptionist.getUserId());
        return entity;
    }

    public Receptionist toDomain(JpaReceptionistEntity entity) {
        if (entity == null) {
            return null;
        }
        Receptionist receptionist = new Receptionist();
        receptionist.setIdReceptionist(entity.getIdReceptionist());
        receptionist.setUserId(entity.getUserId());
        return receptionist;
    }
}