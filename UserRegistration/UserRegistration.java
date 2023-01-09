package com.bridgelabz.Day19.UserRegistration;


import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void firstNameCheck(String name){
        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);
        if(namePattern){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");
        }
    }

    public static void lastNameCheck(String name){
        boolean namePattern = Pattern.matches("^[A-Z]{1}[a-z]{2,}",name);
        if(namePattern){
            System.out.println("Matched");
        }else{
            System.out.println("Not Matched");
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please Enter FirstName");
        firstNameCheck(scr.next());
        System.out.println("Please Enter FirstName");
        lastNameCheck(scr.next());

    }
}
