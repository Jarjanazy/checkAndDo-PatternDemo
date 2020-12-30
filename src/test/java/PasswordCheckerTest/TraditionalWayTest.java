package PasswordCheckerTest;

import PasswordChecker.TraditionalWay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraditionalWayTest {
    TraditionalWay traditionalWay = new TraditionalWay();

    @Test
    void givenAString_DetectItsLengthIsUnder8(){
        String password = "myPass";
        String result = traditionalWay.checkPassword(password);
        assertEquals("Password is under 8 characters", result);
    }

    @Test
    void givenAString_DetectItsOver14(){
        String password = "myPasswordIsVeryLong";
        String result = traditionalWay.checkPassword(password);
        assertEquals("Password is above 14 characters", result);
    }

    @Test
    void givenAString_DetectNoUpperCaseIsGiven(){
        String password = "passnocapital";
        String result = traditionalWay.checkPassword(password);
        assertEquals("Password must have at least one uppercase letter", result);
    }

    @Test
    void givenAString_DetectNoLowerCaseIsGiven(){
        String password = "PASSNOLOWER";
        String result = traditionalWay.checkPassword(password);
        assertEquals("Password must have at least one lowercase letter", result);
    }

    @Test
    void givenAString_AssertSuccess(){
        String password = "validPassword";
        String result = traditionalWay.checkPassword(password);
        assertEquals("Success", result);
    }
}

