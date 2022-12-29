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

        Regex.validateMobileNumber("91 9745775612");
        Regex.validateMobileNumber("919745775612");
        System.out.println("");

        Regex.validatePassword("fhfgdddgqAA$1");
        Regex.validatePassword("hhh11h#$bA");
        System.out.println("");

        // Checking all sample mails

        // A. Valid Emails
        System.out.println("Valid Emails");
        System.out.println("");
        Regex.validateEmail("abc@yahoo.com");
        Regex.validateEmail("abc-100@yahoo.com");
        Regex.validateEmail("abc.100@yahoo.com");
        Regex.validateEmail("abc111@abc.com");
        Regex.validateEmail("abc-100@abc.net");
        Regex.validateEmail("abc.100@abc.com.au");
        Regex.validateEmail("abc@1.com");
        Regex.validateEmail("abc@gmail.com.com");
        Regex.validateEmail("abc+100@gmail.com");

        // B. Invalid Emails
        System.out.println("--------------------");
        System.out.println("Invalid Emails");
        System.out.println("");
        Regex.validateEmail("abc");
        Regex.validateEmail("abc@.com.my");
        Regex.validateEmail("abc123@gmail.a");
        Regex.validateEmail("abc123@.com");
        Regex.validateEmail("abc123@.com.com");
        Regex.validateEmail(".abc@abc.com");
        Regex.validateEmail("abc()*@gmail.com");
        Regex.validateEmail("abc@%*.com");
        Regex.validateEmail("abc..2002@gmail.com");
        Regex.validateEmail("abc.@gmail.com");
        Regex.validateEmail("abc@abc@abc@gmail.com");
        Regex.validateEmail("abc@gmail.com.1a");
        Regex.validateEmail("abc@gmail.com.aa.au");

    }
}
