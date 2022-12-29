package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static boolean validateFirstName(String firstName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("First name " + firstName + " is in proper format");
            return true;
        } else {
            System.out.println("First name " + firstName + " is not in proper format");
            return false;
        }
    }

    public static boolean validateLastName(String lastName){
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("Last name " + lastName + " is in proper format");
            return true;
        } else {
            System.out.println("Last name " + lastName + " is not in proper format");
            return false;
        }
    }

    static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile(
                "^[A-Za-z0-9][A-Za-z0-9+-]*[.]?[A-Za-z0-9+-]+@[A-Za-z0-9][A-Za-z0-9+-]*(.[A-Za-z0-9]+)?.[A-Za-z]{2,6}$"
        );
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("Email " + email + " is in proper format");
            return true;
        } else {
            System.out.println("Email " + email + " is not in proper format");
            return false;
        }
    }
}
