package com.eniskeskin.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.New;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {
    public String producesData(@New StudentDto studentDto){
        studentDto = StudentDto.builder().studentId(0L).
                studentName("student Name").build();
        return studentDto.getStudentSurname();
    }
    @Getter
    @Inject
    private String consumerData;
}
