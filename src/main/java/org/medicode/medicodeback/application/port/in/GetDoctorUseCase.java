package org.medicode.medicodeback.application.port.in;

import org.medicode.medicodeback.domain.model.Doctor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface GetDoctorUseCase {
    Page<Doctor> getDoctors(Pageable pageable);
}
