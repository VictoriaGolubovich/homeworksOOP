package org.example.view;

import org.example.model.User;

public interface View<U extends User> {
    void print(U user);
}
