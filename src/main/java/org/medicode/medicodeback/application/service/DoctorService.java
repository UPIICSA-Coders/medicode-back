package org.medicode.medicodeback.application.service;

import org.medicode.medicodeback.application.port.in.RegistrarDoctorUseCase;
import org.medicode.medicodeback.application.port.out.DoctorRepositoryPort;
import org.medicode.medicodeback.domain.model.Doctor;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DoctorService implements RegistrarDoctorUseCase {

    private final DoctorRepositoryPort doctorRepositoryPort;

    @Override
    public Doctor registrarDoctor(Doctor doctor) {
        // Aquí puedes agregar validaciones de negocio (ej. encriptar contraseña si es necesario)
        return doctorRepositoryPort.guardar(doctor);
    }
}