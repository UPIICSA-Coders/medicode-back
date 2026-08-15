package org.medicode.medicodeback.application.port.in;

import org.medicode.medicodeback.domain.model.Doctor;

public interface DeleteDoctorUseCase {
    void deleteDoctor(Integer doctor);
}
