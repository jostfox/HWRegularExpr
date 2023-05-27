package Homework.hwregularexp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static Homework.hwregularexp.HWRegExpApp.*;

class HWRegExpAppTest {

    private final String numberWOSpace = "1234567";
    private final String numberWithSpace = "123 4567";
    private final String email = "orulyov81@gmail.com";

    @Test
    void checkPhoneNumberWOSpace() {
        Assertions.assertEquals(1,checkPhoneNumber(numberWOSpace));
    }

    @Test
    void checkPhoneNumberWithSpace() {
        Assertions.assertEquals(1,checkPhoneNumber(numberWithSpace));
    }

    @Test
    void checkEmailTest() {
        Assertions.assertEquals(1, checkEmail(email));
    }
}