package com.bl.assignment5;


import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Power of 2 Simulator");

        Scanner ab = new Scanner(System.in);
        System.out.println("Enter The Number to Create the table up to: ");
        int row =ab.nextInt();

        for (int i =0; i<=row; i++){
            int power = (int)(Math.pow(2,i));
            System.out.println(i +"\t" + power + "\n");
        }


    }
}
