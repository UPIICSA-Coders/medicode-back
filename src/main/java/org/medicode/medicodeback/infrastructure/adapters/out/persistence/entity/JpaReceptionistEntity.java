package org.medicode.medicodeback.infrastructure.adapters.out.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "receptionist")
public class JpaReceptionistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReceptionist;

    @Column(name = "user_id", nullable = false)
    private Integer userId;
}