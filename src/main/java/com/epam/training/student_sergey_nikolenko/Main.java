package com.epam.training.student_sergey_nikolenko;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(evenNumber(-1));


    }

    public static boolean evenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}

