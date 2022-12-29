package com.bridgelabz;
import org.junit.jupiter.api.*;
import org.junit.Test;

public class RegexTest {
    @Test
    public void testValidateFirstName(){
        boolean valid = Regex.validateFirstName("Kavya");
        Assertions.assertEquals(true, valid);

        valid = Regex.validateFirstName("kavya");
        Assertions.assertEquals(false, valid);
    }

    @Test
    public void testValidateLastName(){
        boolean valid = Regex.validateLastName("Ganesh");
        Assertions.assertEquals(true, valid);

        valid = Regex.validateLastName("ganesh");
        Assertions.assertEquals(false, valid);
    }

    @Test
    public void testValidateEmail(){
        boolean valid = Regex.validateEmail("kavya@gmail.com");
        Assertions.assertEquals(true, valid);

        valid = Regex.validateLastName("kavz1234");
        Assertions.assertEquals(false, valid);
    }

    @Test
    public void testValidateMobileNumber(){
        boolean valid = Regex.validateMobileNumber("91 9745775612");
        Assertions.assertEquals(true, valid);

        valid = Regex.validateLastName("919745775612");
        Assertions.assertEquals(false, valid);
    }

    @Test
    public void testValidatePassword(){
        boolean valid = Regex.validatePassword("1234A56@78");
        Assertions.assertEquals(true, valid);

        valid = Regex.validatePassword("jhjhAShjh1@@jha");
        Assertions.assertEquals(false, valid);


        // Valid Email check

        valid = Regex.validateEmail("abc@yahoo.com");
        Assertions.assertEquals(true, valid);
        valid = Regex.validateEmail("abc-100@yahoo.com");
        Assertions.assertEquals(true, valid);
        valid = Regex.validateEmail("abc.100@yahoo.com");
        Assertions.assertEquals(true, valid);
        valid = Regex.validateEmail("abc111@abc.com");
        Assertions.assertEquals(true, valid);
        valid = Regex.validateEmail("abc-100@abc.net");
        Assertions.assertEquals(true, valid);
        valid = Regex.validateEmail("abc.100@abc.com.au");
        Assertions.assertEquals(true, valid);
        valid = Regex.validateEmail("abc@1.com");
        Assertions.assertEquals(true, valid);
        valid = Regex.validateEmail("abc@gmail.com.com");
        Assertions.assertEquals(true, valid);
        valid = Regex.validateEmail("abc+100@gmail.com");
        Assertions.assertEquals(true, valid);

        //Invalid Emails

        valid = Regex.validateEmail("abc");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc@.com.my");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc123@gmail.a");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc123@.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc123@.com.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail(".abc@abc.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc()*@gmail.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc@%*.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc..2002@gmail.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc.@gmail.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc@abc@abc@gmail.com");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc@gmail.com.1a");
        Assertions.assertEquals(false, valid);
        valid = Regex.validateEmail("abc@gmail.com.aa.au");
        Assertions.assertEquals(false, valid);
    }
}
