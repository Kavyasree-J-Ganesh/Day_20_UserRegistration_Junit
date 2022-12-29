package com.bridgelabz;

public class RegexMain {
    public static void main(String[] args) {
        Regex.validateFirstName("Kavya");
        Regex.validateFirstName("kavya");
        Regex.validateLastName("Ganesh");
        Regex.validateLastName("ganesh");
        Regex.validateEmail("kavyaganesh@gmail.com");
        Regex.validateEmail("kavyaganeshgmail.com");
        Regex.validateMobileNumber("91 9745775612");
        Regex.validateMobileNumber("919745775612");
        Regex.validatePassword("123");
        Regex.validatePassword("kav&*j1234");
    }
}
