package com.bridgelabz.day5;

import java.util.Scanner;

public class newLeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A year For Checking: ");
        int year = scan.nextInt();
        if(year<1000&&year>10000){
            System.out.println("Please Enter a Valid Year");
        }else if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println("It is a Leap Year");
        }else System.out.println("It is Not a Leap Year");
    }
}
