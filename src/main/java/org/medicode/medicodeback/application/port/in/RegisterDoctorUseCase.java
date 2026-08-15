package org.medicode.medicodeback.application.port.in;

import org.medicode.medicodeback.domain.model.Doctor;

public interface RegisterDoctorUseCase {
    Doctor registerDoctor(Doctor doctor);
}
