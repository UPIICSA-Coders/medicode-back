package org.medicode.medicodeback.infrastructure.adapters.out.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "doctor")
public class JpaDoctorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_doctor")
    private Integer idDoctor;

    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "professional_id")
    private String professionalId;

    @Column(name = "specialty")
    private Integer specialty;

    @Column(name = "office_id")
    private Integer officeId;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Column(name = "schedule", length = 100)
    private String schedule;

    @Column(name = "status")
    private String status;


}
