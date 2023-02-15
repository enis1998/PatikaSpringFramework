package com.eniskeskin.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {
    @Produces
    public List<String> getList(){
        List<String> lists = new ArrayList<>();
        lists.add("Html5");
        lists.add("css3");
        lists.add("js");
        lists.add("react");
        lists.add("angular");
        return lists;
    }

}
