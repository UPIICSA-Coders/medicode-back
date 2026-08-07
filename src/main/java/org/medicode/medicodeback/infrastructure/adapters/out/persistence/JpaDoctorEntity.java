package org.medicode.medicodeback.infrastructure.adapters.out.persistence;

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
@Table(name = "doctor")
public class JpaDoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDoctor;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "professional_id", length = 50)
    private String professionalId;

    @Column(name = "specialty")
    private String specialty;


}
