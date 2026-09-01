package org.medicode.medicodeback.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Doctor {
    private Integer idDoctor;
    private Integer userId;
    private String professionalId;
    private Integer specialty;
    private Integer officeId;
    private LocalDate hireDate;
    private String schedule;
    private String status;
}
