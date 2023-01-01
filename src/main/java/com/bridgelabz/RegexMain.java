package com.bridgelabz;

import java.util.Scanner;

public class RegexMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a Firstname");
            String firstName = scan.nextLine();
            Regex.validateFirstName(firstName);
            System.out.println("Enter a Firstname");
            firstName = scan.nextLine();
            Regex.validateFirstName(firstName);

            System.out.println("");

            System.out.println("Enter a Lastname");
            String lastName = scan.nextLine();
            Regex.validateLastName(lastName);
            System.out.println("Enter a Lastname");
            lastName = scan.nextLine();
            Regex.validateLastName(lastName);

            System.out.println("");

            System.out.println("Enter Email");
            String email = scan.nextLine();
            Regex.validateEmail(email);
            System.out.println("Enter Email");
            email = scan.nextLine();
            Regex.validateEmail(email);

            System.out.println("");

            System.out.println("Enter Phone Number");
            String phone = scan.nextLine();
            Regex.validateMobileNumber(phone);
            System.out.println("Enter Phone Number");
            phone = scan.nextLine();
            Regex.validateMobileNumber(phone);

            System.out.println("");

            System.out.println("Enter Password");
            String password = scan.nextLine();
            Regex.validatePassword(password);
            System.out.println("Enter Password");
            password = scan.nextLine();
            Regex.validatePassword(password);

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

        }catch (CustomException e){

        }
    }
}
