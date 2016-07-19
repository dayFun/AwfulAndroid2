package com.lighthouse.awfulandroid2;

public class NameValidator {

    public static boolean checkName(String name) {
        return name.matches("^[A-Za-z]+\\.[A-Za-z]+\\z");
    }
    
}
