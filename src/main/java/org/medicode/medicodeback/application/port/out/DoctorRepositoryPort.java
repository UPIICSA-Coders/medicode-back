package org.medicode.medicodeback.application.port.out;

import org.medicode.medicodeback.domain.model.Doctor;

public interface DoctorRepositoryPort {
    Doctor guardar(Doctor doctor);
}