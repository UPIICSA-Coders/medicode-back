package org.medicode.medicodeback.application.service;

import lombok.RequiredArgsConstructor;
import org.medicode.medicodeback.application.port.in.GetReceptionistUseCase;
import org.medicode.medicodeback.application.port.in.RegisterReceptionistUseCase;
import org.medicode.medicodeback.application.port.out.ReceptionistRepositoryPort;
import org.medicode.medicodeback.domain.model.Receptionist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReceptionistService implements GetReceptionistUseCase, RegisterReceptionistUseCase {

    private final ReceptionistRepositoryPort receptionistRepositoryPort;

    @Override
    public Page<Receptionist> getReceptionists(Pageable pageable) {
        return receptionistRepositoryPort.findAll(pageable);
    }

    @Override
    public Receptionist register(Receptionist receptionist) {
        return receptionistRepositoryPort.save(receptionist);
    }
}