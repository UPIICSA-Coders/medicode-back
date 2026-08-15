package org.medicode.medicodeback.infrastructure.adapters.in.rest;


import lombok.RequiredArgsConstructor;
import org.medicode.medicodeback.application.port.in.DeleteDoctorUseCase;
import org.medicode.medicodeback.application.port.in.GetDoctorUseCase;
import org.medicode.medicodeback.application.port.in.RegisterDoctorUseCase;
import org.medicode.medicodeback.application.port.in.UpdateDoctorUseCase;
import org.medicode.medicodeback.application.port.out.DoctorRepositoryPort;
import org.medicode.medicodeback.domain.model.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final RegisterDoctorUseCase registerDoctorUseCase;
    private final GetDoctorUseCase getDoctorUseCase;
    private final UpdateDoctorUseCase updateDoctorUseCase;
    private final DoctorRepositoryPort doctorRepositoryPort;
    private final DeleteDoctorUseCase deleteDoctorUseCase;


    @GetMapping
    public ResponseEntity<Page<Doctor>> getDoctors(Pageable pageable) {
        Page<Doctor> doctors = getDoctorUseCase.getDoctors(pageable);
        return ResponseEntity.ok(doctors);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Doctor> updateDoctor(@PathVariable Integer id, @RequestBody Doctor doctor){
        return ResponseEntity.ok(updateDoctorUseCase.updateDoctor(id, doctor));
    }

    @PostMapping
    public ResponseEntity<Doctor> registerDoctor(@RequestBody Doctor doctor){
        return ResponseEntity.status(201).body(registerDoctorUseCase.registerDoctor(doctor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Integer id){
        deleteDoctorUseCase.deleteDoctor(id);
        return ResponseEntity.noContent().build();
    }
}
