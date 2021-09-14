/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        boolean check=true;
        double bmi=0.0;
        double h=0, w=0;
        String height="", weight="";

        do{
            System.out.print("Enter your height in inches: ");
            height=sc.nextLine();
            try{
                h = Double.parseDouble(height);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
        }while(check==false);

        do{
            System.out.print("Enter your weight in pounds: ");
            weight=sc.nextLine();
            try{
                w = Double.parseDouble(weight);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
        }while(check==false);

        bmi=(w/(h*h))*703;
        System.out.printf("Your BMI is %.1f.\n", bmi);

        if(bmi<=25 && bmi>=18.5){
            System.out.print("You are within the ideal weight range.");
        }
        else if(bmi<18.5){
            System.out.print("You are underweight. You should see your doctor.");
        }
        else{
            System.out.print("You are overweight. You should see your doctor.");
        }

    }
}