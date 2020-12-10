package com.Loading;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your number");
        int a=scanner.nextInt();
        while (a<10 ) {
            System.out.println(a);
            a++;
        }
    }
}
