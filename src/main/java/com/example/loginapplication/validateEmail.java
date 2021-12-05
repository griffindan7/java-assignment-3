package com.example.loginapplication;

import java.util.function.Predicate;

public class validateEmail implements Predicate<String> {

    @Override
    public boolean test(String s){
        return s.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z0-9]{1,6}$");
    }
}
