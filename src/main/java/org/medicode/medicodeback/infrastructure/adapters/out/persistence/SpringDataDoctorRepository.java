package org.medicode.medicodeback.infrastructure.adapters.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataDoctorRepository extends JpaRepository<DoctorEntity, Long> {
}