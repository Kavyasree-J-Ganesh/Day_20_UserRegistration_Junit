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
        boolean valid = Regex.validatePassword("12345678");
        Assertions.assertEquals(true, valid);

        valid = Regex.validatePassword("jhjh");
        Assertions.assertEquals(false, valid);
    }
}
