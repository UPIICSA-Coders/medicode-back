package org.medicode.medicodeback.infrastructure.adapters.out.persistence;

import org.medicode.medicodeback.domain.model.Doctor;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapper {

    public DoctorEntity toEntity(Doctor domain) {
        if (domain == null) return null;
        return new DoctorEntity(
            domain.getId(),
            domain.getNombre(),
            domain.getApellidoPaterno(),
            domain.getApellidoMaterno(),
            domain.getEmail(),
            domain.getTelefono(),
            domain.getContrasena(),
            domain.getCedulaProfesional(),
            domain.getDireccion()
        );
    }

    public Doctor toDomain(DoctorEntity entity) {
        if (entity == null) return null;
        return new Doctor(
            entity.getId(),
            entity.getNombre(),
            entity.getApellidoPaterno(),
            entity.getApellidoMaterno(),
            entity.getEmail(),
            entity.getTelefono(),
            entity.getContrasena(),
            entity.getCedulaProfesional(),
            entity.getDireccion()
        );
    }
}