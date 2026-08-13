package org.medicode.medicodeback.application.service;

import lombok.RequiredArgsConstructor;
import org.medicode.medicodeback.application.port.in.GetDoctorUseCase;
import org.medicode.medicodeback.application.port.in.UpdateDoctorUseCase;
import org.medicode.medicodeback.application.port.out.DoctorRepositoryPort;
import org.medicode.medicodeback.domain.model.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorService implements GetDoctorUseCase, UpdateDoctorUseCase{

    private final DoctorRepositoryPort doctorRepositoryPort;

    @Override
    public Page<Doctor> getDoctors(Pageable pageable){
        return doctorRepositoryPort.findAll(pageable);
    }

    @Override
    public Doctor updateDoctor(Integer id, Doctor doctorData){
        Doctor existingDoctor = doctorRepositoryPort.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found"));

        existingDoctor.setUserId(doctorData.getUserId());
        existingDoctor.setProfessionalId(doctorData.getProfessionalId());
        existingDoctor.setSpecialty(doctorData.getSpecialty());

        return doctorRepositoryPort.save(existingDoctor);
    }

}
