package com.bl.assignment5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int n = ab.nextInt();

        boolean leap;

        if (n % 4==0){
            leap = true;
        }
        else{
            leap = false;
        }

        if (leap){
            System.out.println("This is Leap Year");
        }
        else{
            System.out.println("This is Not a Leap Year");
        }

    }
}
