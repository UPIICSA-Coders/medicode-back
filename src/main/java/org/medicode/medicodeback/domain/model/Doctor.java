package org.medicode.medicodeback.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Doctor {
    private Integer idDoctor;
    private Integer userId;
    private String professionalId;
    private Integer speciality;
}
