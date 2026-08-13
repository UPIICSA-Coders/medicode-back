package org.medicode.medicodeback.infrastructure.adapters.out.persistence.repository;

import org.medicode.medicodeback.infrastructure.adapters.out.persistence.entity.JpaDoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataDoctorRepository extends JpaRepository<JpaDoctorEntity,Integer> {
}
