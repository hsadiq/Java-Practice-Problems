package com.bl.assignment5;
import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {

        Scanner ab = new Scanner(System.in);

        System.out.println("Enter The Harmonic Value: ");

        int Hnum = ab.nextInt();
        System.out.print("the Harmonic Series up to: " +Hnum);
        for(int i=1; i<=Hnum; i++ ){
            if (i != 1){
                System.out.print("+");
            }
            System.out.print("1/" + i);

        }


    }
}
