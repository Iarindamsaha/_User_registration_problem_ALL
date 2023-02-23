package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    @DisplayName("FirstName Check")
    public void checkGivenFirstName(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getFirstName("Arindam");
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("LastName Check")
    public void checkGivenLastName(){

        UserRegistration userNameTest = new UserRegistration();
        Boolean result =userNameTest.getLastName("Saha");
        Assertions.assertTrue(result);

    }

}
