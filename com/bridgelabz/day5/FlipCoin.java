package com.bridgelabz.day5;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of time you want to Flip a coin: ");
        int numberOfFlip = scan.nextInt();
        int headCount = 0;
        int tailCount = 0;
        for (int i = 1; i <= numberOfFlip; i++) {
            headCount = 0;
            tailCount = 0;
            Random random = new Random();
            int flipOfCoin = random.nextInt(2);
            if (flipOfCoin == 0) {
                System.out.println("Head");
            } else {
                System.out.println("Tails");
            }
            headCount++;
            tailCount++;
        }
        System.out.println("No of Times Head Arrives: " + headCount);
        System.out.println("No of Times Tails Arrives: " + tailCount);
    }
}