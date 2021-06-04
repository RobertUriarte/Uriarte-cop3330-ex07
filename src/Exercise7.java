/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise7 {
    static double conversion_factor = 0.09290304;
    public static void main(String[] args) { //Program to get area of room in feet and square meters

        System.out.print("What is the length of the room in feet? ");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        System.out.print("What is the width of the room in feet? ");
        int width = scan.nextInt();
        System.out.println("You entered dimensions of " + length + " feet" + " by " + width + " feet.");
        System.out.println("The area is");
        int area = length * width;
        System.out.println(area + " square feet.");
        
        double m2 = area * conversion_factor;

        System.out.printf("%.3f square meters",m2);




    }
}