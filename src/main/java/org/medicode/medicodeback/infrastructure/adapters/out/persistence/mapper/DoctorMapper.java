package org.medicode.medicodeback.infrastructure.adapters.out.persistence.mapper;

import org.medicode.medicodeback.domain.model.Doctor;
import org.medicode.medicodeback.infrastructure.adapters.out.persistence.entity.JpaDoctorEntity;
import org.springframework.stereotype.Component;

@Component
public class DoctorMapper {
    public JpaDoctorEntity toEntity(Doctor doctor){
        if (doctor == null){
            return null;
        }

        JpaDoctorEntity entity = new JpaDoctorEntity();
        entity.setIdDoctor(doctor.getIdDoctor());
        entity.setUserId(doctor.getUserId());
        entity.setProfessionalId(doctor.getProfessionalId());
        entity.setSpecialty(doctor.getSpecialty());

        return entity;
    }

    public Doctor toDomain(JpaDoctorEntity entity){
        if(entity == null){
            return null;
        }

        Doctor doctor = new Doctor();
        doctor.setIdDoctor(entity.getIdDoctor());
        doctor.setUserId(entity.getUserId());
        doctor.setProfessionalId(entity.getProfessionalId());
        doctor.setSpecialty(entity.getSpecialty());

        return doctor;
    }
}
