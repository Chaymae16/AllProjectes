package com.syntax.review2;

public class NestedIf {
    public static void main(String[] args) {

        boolean driverLicense=true;
        boolean car=true;
        if (driverLicense){
            System.out.println("Let's check if you have a car");

           if (car){
               System.out.println("You can drive to work");
           }
        }else {
            System.out.println("You should get a DL");
        }

    }
}
