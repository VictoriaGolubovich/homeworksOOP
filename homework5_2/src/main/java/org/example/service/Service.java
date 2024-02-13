package org.example.service;


import org.example.model.Education;

public interface Service<U extends Education> {
    void create(U user);
    U read(int id);


}
