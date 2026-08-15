package org.medicode.medicodeback.application.service;

import lombok.RequiredArgsConstructor;
import org.medicode.medicodeback.application.port.in.DeleteDoctorUseCase;
import org.medicode.medicodeback.application.port.in.GetDoctorUseCase;
import org.medicode.medicodeback.application.port.in.RegisterDoctorUseCase;
import org.medicode.medicodeback.application.port.in.UpdateDoctorUseCase;
import org.medicode.medicodeback.application.port.out.DoctorRepositoryPort;
import org.medicode.medicodeback.domain.model.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorService implements GetDoctorUseCase, UpdateDoctorUseCase, RegisterDoctorUseCase, DeleteDoctorUseCase{

    private final DoctorRepositoryPort doctorRepositoryPort;

    ///
    /// CREATE a new doctor
    ///
    @Override
    public Doctor registerDoctor(Doctor doctor){
        return doctorRepositoryPort.save(doctor);
    }

    ///
    /// READ doctors by pageable (it means one part in a page, to see other register you can navigate to other page)
    ///
    @Override
    public Page<Doctor> getDoctors(Pageable pageable){
        return doctorRepositoryPort.findAll(pageable);
    }

    ///
    /// UPDATE doctor register, right now it gets UserId, ProfessionalId, and Specialty
    ///
    @Override
    public Doctor updateDoctor(Integer id, Doctor doctorData){
        Doctor existingDoctor = doctorRepositoryPort.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found"));

        existingDoctor.setUserId(doctorData.getUserId());
        existingDoctor.setProfessionalId(doctorData.getProfessionalId());
        existingDoctor.setSpecialty(doctorData.getSpecialty());

        return doctorRepositoryPort.save(existingDoctor);
    }

    ///
    /// DELETE or SUSPEND, this one depends rn on the data base team lets check it out until now
    ///
    @Override
    public void deleteDoctor(Integer id){
        doctorRepositoryPort.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found for deletion"));

        doctorRepositoryPort.deleteById(id);
    }

}
