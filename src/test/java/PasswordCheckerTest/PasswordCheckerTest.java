package PasswordCheckerTest;

import PasswordChecker.CheckAndDoWay;
import PasswordChecker.TraditionalWay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordCheckerTest {
    TraditionalWay traditionalWay = new TraditionalWay();
    CheckAndDoWay checkAndDoWay = new CheckAndDoWay();

    @Test
    void givenAString_DetectItsLengthIsUnder8(){
        String password = "myPass";
        String result = traditionalWay.checkPasswordAndSubmit(password);
        String result2 = checkAndDoWay.checkPassword(password);
        assertEquals("Password is under 8 characters", result);
        assertEquals("Password is under 8 characters", result2);
    }

    @Test
    void givenAString_DetectItsOver14(){
        String password = "myPasswordIsVeryLong";
        String result = traditionalWay.checkPasswordAndSubmit(password);
        String result2 = checkAndDoWay.checkPassword(password);
        assertEquals("Password is above 14 characters", result);
        assertEquals("Password is above 14 characters", result2);

    }

    @Test
    void givenAString_DetectNoUpperCaseIsGiven(){
        String password = "passnocapital";
        String result = traditionalWay.checkPasswordAndSubmit(password);
        String result2 = checkAndDoWay.checkPassword(password);
        assertEquals("Password must have at least one uppercase letter", result);
        assertEquals("Password must have at least one uppercase letter", result2);
    }

    @Test
    void givenAString_DetectNoLowerCaseIsGiven(){
        String password = "PASSNOLOWER";
        String result = traditionalWay.checkPasswordAndSubmit(password);
        String result2 = checkAndDoWay.checkPassword(password);
        assertEquals("Password must have at least one lowercase letter", result);
        assertEquals("Password must have at least one lowercase letter", result2);
    }

    @Test
    void givenAString_DetectNoTwDigitsIsGiven(){
        String password = "PassWord1";
        String result = traditionalWay.checkPasswordAndSubmit(password);
        String result2 = checkAndDoWay.checkPassword(password);
        assertEquals("Password must have at least two digits", result);
        assertEquals("Password must have at least two digits", result2);
    }

    @Test
    void givenAString_DetectNoSpecialCharacterIsGiven(){
        String password = "PassWord01";
        String result = traditionalWay.checkPasswordAndSubmit(password);
        String result2 = checkAndDoWay.checkPassword(password);
        assertEquals("Password must have at least one special character", result);
        assertEquals("Password must have at least one special character", result2);
    }

    @Test
    void givenAString_AssertSuccess(){
        String password = "validPass12.";
        String result = traditionalWay.checkPasswordAndSubmit(password);
        String result2 = checkAndDoWay.checkPassword(password);
        assertEquals("Submitted", result);
        assertEquals("Submitted", result2);
    }
}

