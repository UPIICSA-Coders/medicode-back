package org.medicode.medicodeback.infrastructure.adapters.out.persistence;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "specialty")
public class JpaSpecialtyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_specialty")
    private Integer idSpecialty;

    @Column(name = "specialty_name", length = 100, nullable = false)
    private String specialtyName;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "is_active")
    private Boolean isActive;
}
