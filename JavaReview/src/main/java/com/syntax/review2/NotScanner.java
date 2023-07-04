package com.syntax.review2;

import java.util.Scanner;

public class NotScanner {
    public static void main(String[] args) {

        int i=10;
        Scanner key=new Scanner(System.in);

        System.out.println("Pleas enter 1 word");

        String word =key.next();
        System.out.println("Word that was captured = "+word);

        System.out.println("Pleas enter integer value");
        int number=key.nextInt();
        System.out.println("Entered number is ="+word);

        System.out.println("Please enter decimal value");



    }
}
