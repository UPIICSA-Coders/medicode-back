package org.medicode.medicodeback.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Specialty {
    private Integer idSpecialty;
    private String specialtyName;
    private String description;
    private Boolean isActive;
}
