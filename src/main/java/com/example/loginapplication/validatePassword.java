package com.example.loginapplication;

import java.util.function.Predicate;

public class validatePassword implements Predicate<String> {

    @Override
    public boolean test(String s){
        return s.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[*^&@!]).{6,}");
    }
}
