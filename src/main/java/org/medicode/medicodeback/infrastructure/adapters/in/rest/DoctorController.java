package org.medicode.medicodeback.infrastructure.adapters.in.rest;

import org.medicode.medicodeback.application.port.in.RegistrarDoctorUseCase;
import org.medicode.medicodeback.domain.model.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/doctores")
@RequiredArgsConstructor
public class DoctorController {

    private final RegistrarDoctorUseCase registrarDoctorUseCase;

    @PostMapping
    public ResponseEntity<Doctor> registrarDoctor(@RequestBody Doctor doctor) {
        Doctor nuevoDoctor = registrarDoctorUseCase.registrarDoctor(doctor);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoDoctor);
    }
}