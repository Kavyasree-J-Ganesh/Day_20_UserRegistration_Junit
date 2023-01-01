package com.bridgelabz;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.Test;
import static org.junit.Assert.fail;

public class RegexTest {
    @Test
    public void testValidateFirstName(){                   //Happy case
        try{
            boolean valid = Regex.validateFirstName.checkRegexValidity("Kavya");
            Assertions.assertEquals(true, valid);
        } catch (CustomException e){
            fail("Should not throw exception");
        }

        try{
            boolean valid = Regex.validateFirstName.checkRegexValidity("kavya");              // Sad case
        }catch (CustomException e){
            Assertions.assertEquals("Invalid Firstname", e.getMessage());
        }
    }

    @Test
    public void testValidateLastName(){
        try{
            boolean valid = Regex.validateLastName.checkRegexValidity("Ganesh");
            Assertions.assertEquals(true, valid);
        } catch (CustomException e){
            fail("Should not throw exception");
        }

        try{
            boolean valid = Regex.validateLastName.checkRegexValidity("ganesh");
        }catch (CustomException e){
            Assertions.assertEquals("Invalid Lastname", e.getMessage());
        }


    }

    @Test
    public void testValidateEmail(){
        try{
            boolean valid = Regex.validateEmail.checkRegexValidity("kavya@gmail.com");
            Assertions.assertEquals(true, valid);
        } catch (CustomException e){
            fail("Should not throw exception");
        }

        try{
            boolean valid = Regex.validateEmail.checkRegexValidity("kavz1234");
        }catch (CustomException e){
            Assertions.assertEquals("Invalid Email", e.getMessage());
        }


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
        try{
            boolean valid = Regex.validateEmail.checkRegexValidity(email);
            Assertions.assertEquals(true, valid);
        } catch (CustomException e){
            fail("Should not throw exception");
        }

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
        try{
            boolean valid = Regex.validateEmail.checkRegexValidity(email);
        }catch (CustomException e){
            Assertions.assertEquals("Invalid Email", e.getMessage());
        }
    }

    @Test
    public void testValidateMobileNumber(){
        try{
            boolean valid = Regex.validateMobileNumber.checkRegexValidity("91 9745775612");
            Assertions.assertEquals(true, valid);
        } catch (CustomException e){
            fail("Should not throw exception");
        }

        try{
            boolean valid = Regex.validateMobileNumber.checkRegexValidity("919745775612");
            Assertions.assertEquals(false, valid);
        }catch (CustomException e){
            Assertions.assertEquals("Invalid Mobile Number", e.getMessage());
        }
    }

    @Test
    public void testValidatePassword(){
        try{
            boolean valid = Regex.validatePassword.checkRegexValidity("1234A56@78");
        }catch (CustomException e){
            fail("Should not throw exception");
        }

        try{
            boolean valid = Regex.validatePassword.checkRegexValidity("jhjhAShjh1@@jha");

        }catch (CustomException e){
            Assertions.assertEquals("Invalid Password", e.getMessage());
        }
    }
}
