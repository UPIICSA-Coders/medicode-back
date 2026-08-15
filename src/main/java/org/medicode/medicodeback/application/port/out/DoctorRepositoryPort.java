package org.medicode.medicodeback.application.port.out;

import org.medicode.medicodeback.domain.model.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface DoctorRepositoryPort {
    Page<Doctor> findAll(Pageable pageable);
    Optional<Doctor> findById(Integer id);
    Doctor save(Doctor doctor);
    void deleteById(Integer doctor);
}
