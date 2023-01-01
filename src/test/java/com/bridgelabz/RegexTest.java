package com.bridgelabz;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.Test;

public class RegexTest {
    @Test
    public void testValidateFirstName(){                     //Happy case
        boolean valid = Regex.validateFirstName("Kavya");
        Assertions.assertEquals(true, valid);

        valid = Regex.validateFirstName("kavya");              // Sad case
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
    @ParameterizedTest
    @ValueSource(
            strings = {
                    "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com",
                    "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au",
                    "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"
            }
    )
    public void testValidateEmailParameterizedHappy(String email){
        boolean valid = Regex.validateEmail(email);
        Assertions.assertEquals(true, valid);
    }

    @ParameterizedTest
    @ValueSource(
            strings = {
                   "abc", "abc@.com.my", "abc123@gmail.a",
                    "abc123@.com", "abc123@.com.com", ".abc@abc.com",
                    "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com",
                    "abc.@gmail.com", "abc@abc@abc@gmail.com", "abc@gmail.com.1a",
                    "abc@gmail.com.aa.au"
            }
    )
    public void testValidateEmailParameterizedSad(String email){
        boolean valid = Regex.validateEmail(email);
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
    }
}
