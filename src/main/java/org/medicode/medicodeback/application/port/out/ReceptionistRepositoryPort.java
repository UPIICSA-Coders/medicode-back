package org.medicode.medicodeback.application.port.out;

import org.medicode.medicodeback.domain.model.Receptionist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReceptionistRepositoryPort {
    Page<Receptionist> findAll(Pageable pageable);
    Receptionist save(Receptionist receptionist);
}