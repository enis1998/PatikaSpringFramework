package com.eniskeskin.cdi;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
public class StudentDto {
    private Long studentId;
    private String studentName;
    private String studentSurname;
}
