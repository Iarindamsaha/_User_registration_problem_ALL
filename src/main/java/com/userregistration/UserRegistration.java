package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean getFirstName(String firstName){

        String userNameRegex = "^[A-Z]{1}[a-z]{3,}";
        Pattern pattern = Pattern.compile(userNameRegex);

        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        return result;

    }


    public Boolean getLastName(String lastName) {

        String userNameRegex = "[A-Z]{1}[a-z]{3}";
        Pattern pattern = Pattern.compile(userNameRegex);

        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        return result;

    }

    public Boolean getEmail(String email) {

        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+(@)[a-z0-9]+[.][a-z]+[.]?[a-z]+$";
        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();

        return result;

    }

    public Boolean getPhoneNumber(String phoneNumber) {

        String phoneNumberRegex = "^[1-9]{2}\\s[0-9]{10}$";
        Pattern pattern = Pattern.compile(phoneNumberRegex);

        Matcher matcher = pattern.matcher(phoneNumber);
        boolean result = matcher.matches();

        return result;

    }





}
