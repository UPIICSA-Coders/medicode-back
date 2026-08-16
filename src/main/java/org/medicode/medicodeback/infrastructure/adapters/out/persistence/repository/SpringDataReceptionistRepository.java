package org.medicode.medicodeback.infrastructure.adapters.out.persistence.repository;

import org.medicode.medicodeback.infrastructure.adapters.out.persistence.entity.JpaReceptionistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataReceptionistRepository extends JpaRepository<JpaReceptionistEntity, Integer> {
}