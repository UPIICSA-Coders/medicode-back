package org.medicode.medicodeback.infrastructure.adapters.in.rest;

import lombok.RequiredArgsConstructor;
import org.medicode.medicodeback.application.port.in.GetReceptionistUseCase;
import org.medicode.medicodeback.application.port.in.RegisterReceptionistUseCase;
import org.medicode.medicodeback.domain.model.Receptionist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/receptionists")
@RequiredArgsConstructor
public class ReceptionistController {

    private final GetReceptionistUseCase getReceptionistUseCase;
    private final RegisterReceptionistUseCase registerReceptionistUseCase;

    @GetMapping
    public ResponseEntity<Page<Receptionist>> getReceptionists(Pageable pageable) {
        Page<Receptionist> receptionists = getReceptionistUseCase.getReceptionists(pageable);
        return ResponseEntity.ok(receptionists);
    }

    @PostMapping
    public ResponseEntity<Receptionist> registerReceptionist(@RequestBody Receptionist receptionist) {
        Receptionist savedReceptionist = registerReceptionistUseCase.register(receptionist);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedReceptionist);
    }
}