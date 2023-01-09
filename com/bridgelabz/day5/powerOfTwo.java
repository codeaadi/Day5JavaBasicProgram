package com.bridgelabz.day5;

import java.util.Scanner;

        class powerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int N = scan.nextInt();
        int pow =1;
        for(int i=1;i<=N;i++){
             pow =pow*2;
            System.out.println("Value Of 2 Till Power " + N +" is "+pow);
        }

    }


}
