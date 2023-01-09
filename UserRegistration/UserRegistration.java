package com.bridgelabz.Day19.UserRegistration;


import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        String firstName = "Nikhil";

        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",firstName);
        if(namePattern){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");
        }



    }
}
