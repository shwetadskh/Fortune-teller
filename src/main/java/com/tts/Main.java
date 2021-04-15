package com.tts;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please Enter Your First Name: ");
        String userFname = input.nextLine();

        System.out.println("Please Enter Your Last Name: ");
        String userLname = input.nextLine();

        System.out.println("Please Enter Your Age: ");
        int userAge = input.nextInt();

        System.out.println("What is your birth month (as an ‘int’).");
        int bthMonth = input.nextInt();
        input.nextLine() ;

        String  favColor = "" ;
        System.out.println("what is your favorite ROYGBIV color? if you do not know what ROYGBIV , please enter HELP");
        String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"} ;

        //setting True
        while(true){

            favColor = input.nextLine();
            // Check if user asks for help
            if (favColor.equalsIgnoreCase("help")   ){
                System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");

            // Check if user enters the valid colors, valid colors are in the array favColor
            // we use stream object of array and anyMatch method to find if user entry matches any values in the array
            } else if  (!Arrays.stream(colors).anyMatch(favColor::equalsIgnoreCase)){
                System.out.println("Please enter Valid colors, Valid colors are red, orange, yellow, green, blue, indigo, violet.");
            } else {
                break ;
            }
        }

        System.out.println("How many siblings do you have?");
        int siblingNum = input.nextInt();

        // Fortune
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++") ;
        System.out.println(userFname + " " + userLname + " Please find your fortune just for you ") ;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++") ;

        //Conditions
        int ageToRetire = 0 ;
        double bankBalance = 0 ;
        String vacationHome = "" ;
        String modeofTransp = "" ;

        // First find age to retire , we will use 65 as retiring age
        if (userAge <= 65){
            ageToRetire = 65 - userAge ;
        } else {
            ageToRetire = 0 ;
        }

        // Second , we will find bank balance
        switch (bthMonth) {
            case 1:
                bankBalance = 1 * 150000.99 ;
                break;
            case 2:
                bankBalance = 2 * 50000.01 ;
                break;
            case 3:
                bankBalance = 3 * 100000.3 ;
                break;
            case 4:
                bankBalance = 4 * 50000.3 ;
                break;
            case 5:
                bankBalance = 5 * 45000.2 ;
                break;
            case 6:
                bankBalance = 6 * 39000.11 ;
                break;
            case 7:
                bankBalance = 7 * 25000.99 ;
                break;
            case 8:
                bankBalance = 8 * 39000.22 ;
                break;
            case 9:
                bankBalance = 9 * 15000.66 ;
                break;
            case 10:
                bankBalance = 10 * 15000.99 ;
                break;
            case 11:
                bankBalance = 11 * 19000.67 ;
                break;
            case 12:
                bankBalance = 12 * 15000.06 ;
                break;
            default:
                bankBalance = 0.00 ;
        }

        // Third, Find the vacation Home
        if (siblingNum == 0){
            vacationHome = "Tampa, Florida" ;
        } else if (siblingNum == 1) {
            vacationHome = "Bahamas" ;

        } else if (siblingNum == 2) {
            vacationHome = "Alaska, US" ;

        } else if (siblingNum == 3) {
            vacationHome = "Concun, Mexico" ;

        } else if (siblingNum > 3) {
            vacationHome = "Goa, India" ;

        }else if (siblingNum < 0) {
            vacationHome = "Hawai, USA" ;

        }

        // Fourth, find Mode of Transport
        switch (favColor.toLowerCase()) {
            case "red":
                modeofTransp = "Maserati";
                break;
            case "orange":
                modeofTransp = "Ferari";
                break;
            case "yellow":
                modeofTransp = "Private plane";
                break;
            case "blue":
                modeofTransp = "Train";
                break;
            case "indigo":
                modeofTransp = "Horse";
                break;
            case "violet":
                modeofTransp = "Walking";
                break;
        }

        System.out.println(userFname + " " + userLname + " will retire in " + ageToRetire  + " years with $" +  bankBalance + " in the bank, ");
        System.out.println("a Vacation home in " + vacationHome +  ", and travel by " + modeofTransp);



    }
}
