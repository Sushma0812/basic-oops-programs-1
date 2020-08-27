package com.stackroute;

import java.util.Scanner;
/*
 *This class contains methods to calculate average
 */

class Average {
    int numberOne;
    int numberTwo;
    int numberThree;

    public float getAverage() {
        return (numberOne + numberTwo + numberThree) / 3;    //return average value to called function

    }
}

class TestAverage {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Average average = new Average();
        System.out.println("Enter three numbers");
        average.numberOne = reader.nextInt();
        average.numberTwo = reader.nextInt();
        average.numberThree = reader.nextInt();
        System.out.println("Average is " + obj.getAverage());     //average is displayed


    }
}
