package com.eniskeskin.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;


@Named(value = "cdiBean")
@ApplicationScoped
@Setter @Getter
public class JSFBean {
    private String patika;

    public JSFBean() {
        this.patika = "Spring Boot Welcome";
    }
}
