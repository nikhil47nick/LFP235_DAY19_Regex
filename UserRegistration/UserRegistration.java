package com.bridgelabz.Day19.UserRegistration;


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void patterResult(boolean pattern){
        if(pattern){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid!");
        }
    }
    public static void firstNameCheck(String name){
        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);
        patterResult(namePattern);
    }

    public static void lastNameCheck(String name){
        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);
        patterResult(namePattern);
    }

    public static void emailCheck(String name){
        boolean emailPattern = Pattern.matches("^(?=.*[a-z])(?=.*[0-9])(?=.*[._-])[a-z0-9._-]*[@](?=.*[a-z])(?=.*[0-9])(?=.*[.])[a-z0-9.]+[a-z]{2,4}$",name);
        patterResult(emailPattern);
    }

    public static void phoneNumberCheck(String name){
        boolean numberPattern = Pattern.matches("^[0-9]{2} [0-9]{10}",name);
        patterResult(numberPattern);
    }

    public static void passwordCheck(String name){
        boolean emailPattern = Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^\\d\\w])[A-Za-z0-9#?!@$%^&*-]{8,}",name);
        patterResult(emailPattern);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        passwordCheck(scr.next());
        System.out.println("Please Enter FirstName");
        firstNameCheck(scr.next());
        System.out.println("Please Enter LastName");
        lastNameCheck(scr.next());
        System.out.println("Please email");
        emailCheck(scr.next());
    }
}
