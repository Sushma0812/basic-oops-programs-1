package com.stackroute;

import java.util.Scanner;                                 // Scanner class is imported from java.util

class Triangle {                                           // class is created
    int sideOne;                                        // Declaration of variables
    int sideTwo;
    int sideThree;

    public double getArea()                               //Method is created
    {
        double semi_perimeter = (sideOne + sideTwo + sideThree) / 2.0;                           //Area is calculated
        return Math.pow((semi_perimeter * (semi_perimeter - sideOne) * (semi_perimeter - sideTwo) * (semi_perimeter - sideThree)), 0.5);
    }

    public double getPerimeter()                          //Method is created
    {
        return (sideOne + sideTwo + sideThree) / 2.0;                               //Perimeter is calculated
    }
}

class Main {                                               //class is created

    public static void main(String[] args) {                           //Main method
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter sides of a triangle");
        Triangle triangle = new Triangle();                                //object is created
        triangle.sideOne = reader.nextInt();
        triangle.sideTwo = reader.nextInt();                                     //reads input from user
        triangle.sideThree = reader.nextInt();
        System.out.println("Area is " + triangle.getArea());                 //Area is printed
        System.out.println("Perimeter is " + triangle.getPerimeter());       //Perimeter is printed
    }
}
