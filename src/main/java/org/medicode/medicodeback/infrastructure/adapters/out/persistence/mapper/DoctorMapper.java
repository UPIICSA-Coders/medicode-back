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
        entity.setOfficeId(doctor.getOfficeId());
        entity.setHireDate(doctor.getHireDate());
        entity.setSchedule(doctor.getSchedule());
        entity.setStatus(doctor.getStatus());

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
        doctor.setOfficeId(entity.getOfficeId());
        doctor.setHireDate(entity.getHireDate());
        doctor.setSchedule(entity.getSchedule());
        doctor.setStatus(entity.getStatus());

        return doctor;
    }
}
