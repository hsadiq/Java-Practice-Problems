package com.bl.assignment5;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = ab.next().charAt(0);
        boolean vowel = false;

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                vowel = true;
                break;
            default:
                vowel = false;
        }
        if (vowel){
            System.out.println("You Enter: "+ ch + " this is vowel");
        }
        else{
            System.out.println("You Enter: "+ ch + " this is Consonant");
        }
    }
}
