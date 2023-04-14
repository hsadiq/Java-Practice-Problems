package com.bl.assignment5;

public class CoinToss {
    public static void main(String[] args) {
        int head = 0;
        int x = (int)(Math.random() *2 %2);

        if (x == head ){
            System.out.println("Head");
        }else{
            System.out.println("tail");
        }

    }

}

