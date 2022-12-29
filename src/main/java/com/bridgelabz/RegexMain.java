package com.bridgelabz;

public class RegexMain {
    public static void main(String[] args) {
        Regex.validateFirstName("Kavya");
        Regex.validateFirstName("kavya");
        System.out.println("");

        Regex.validateLastName("Ganesh");
        Regex.validateLastName("ganesh");
        System.out.println("");

        Regex.validateEmail("kavyaganesh@gmail.com");
        Regex.validateEmail("kavyaganeshgmail.com");
        System.out.println("");
    }
}
