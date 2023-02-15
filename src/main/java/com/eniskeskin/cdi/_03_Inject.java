package com.eniskeskin.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.List;

@Named(value = "injecttuto")
@ApplicationScoped
public class _03_Inject {
    List<String> consumer;

    @jakarta.inject.Inject
    public List<String> getConsumer() {
        return consumer;
    }

}
