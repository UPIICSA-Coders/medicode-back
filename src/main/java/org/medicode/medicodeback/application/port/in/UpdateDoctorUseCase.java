package org.medicode.medicodeback.application.port.in;

import org.medicode.medicodeback.domain.model.Doctor;

public interface UpdateDoctorUseCase {
    Doctor updateDoctor(Integer id, Doctor doctor);
}
