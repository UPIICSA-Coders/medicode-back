package org.medicode.medicodeback.application.port.in;

import org.medicode.medicodeback.domain.model.Receptionist;

public interface RegisterReceptionistUseCase {
    Receptionist register(Receptionist receptionist);
}