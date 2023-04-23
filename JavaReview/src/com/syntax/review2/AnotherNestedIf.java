package com.syntax.review2;

public class AnotherNestedIf {
    public static void main(String[] args) {

        boolean vaccine=true;
        int dose=1;
        if (vaccine){

            if (dose==1){
                System.out.println("You need second dose");
            } else if (dose==2) {
                System.out.println("You ara fully vaccinated");

            } else if (dose==3) {
                System.out.println("You ara fully vaccinated with booster");

            }
        }
    }
}
