package com.bridgelabz.day5;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number%2==0){
            System.out.println("Given Number is Even.");
        }else System.out.println("given Number Is Odd.");
    }
}
