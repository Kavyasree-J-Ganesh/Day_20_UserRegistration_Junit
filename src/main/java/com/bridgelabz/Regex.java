package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static FunctionInter validateFirstName = (String firstName) ->{
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("First name " + firstName + " is in proper format");
            return true;
        } else {
            System.out.println("First name " + firstName + " is not in proper format");
            throw new CustomException("Invalid Firstname");
        }
    };

    public static FunctionInter validateLastName = (String lastName)->{
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("Last name " + lastName + " is in proper format");
            return true;
        } else {
            System.out.println("Last name " + lastName + " is not in proper format");
            throw new CustomException("Invalid Lastname");
        }
    };

    static FunctionInter validateEmail = (String email)->{
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
            throw new CustomException("Invalid Email");
        }
    };

    static FunctionInter validateMobileNumber = (String mobileNumber) ->{
        Pattern pattern = Pattern.compile("^[0-9]{2} [0-9]{10}$");
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean matchFound = matcher.matches();

        if(matchFound){
            System.out.println("Mobile Number " + mobileNumber + " is in proper format");
            return true;
        } else {
            System.out.println("Mobile Number " + mobileNumber + " is not in proper format");
            throw new CustomException("Invalid Mobile Number");
        }
    };

    static FunctionInter validatePassword = (String password) ->{
        Pattern pattern = Pattern.compile("^(?=[A-Za-z0-9@#$%^&+!=]+$)^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+!=])(?=.{8,}).*$");
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.matches();

        pattern = Pattern.compile("^[A-Za-z0-9]*[@#$%^&+!=]{1}[A-Za-z0-9]*$");
        matcher = pattern.matcher(password);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        if(matchFound && count==1){
            System.out.println("Password " + password + " is in proper format");
            return true;
        } else {
            System.out.println("Password " + password + " is not in proper format");
            throw new CustomException("Invalid Password");
        }
    };
}
