package org.example;

import java.util.Scanner;

public class BoilingWater {

    public static void main(String[] args) {
        System.out.println("Enter a number greater than 212");
        int userInt =  getUserInput();
        System.out.println(boilingWater(userInt));
    }
    public static String boilingWater(int userInput){
        if (userInput >= 212){
            return "Water is boiling!";
        } else {
            return "Water is not hot enough. Please try again!";
        }
    }
    public static int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.valueOf(scanner.nextLine());
        return userInput;
    }

}
