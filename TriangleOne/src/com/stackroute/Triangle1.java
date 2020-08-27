package com.stackroute;                                    // it is the package
import java.util.Scanner;                                  // Scanner class is imported from java.util
class Triangle {                                           // class is created

    public double getArea(int a, int b,int c)                                //Method is created
    {
        double s = (a + b + c) / 2.0;                           //Area is calculated
        return Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5);
    }

    public double getPerimeter(int a, int b, int c)                               //Method is created
    {
        return (a + b + c) / 2.0;                              //Perimeter is calculated
    }
}


public class Main {
     static int side1,side2,side3;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter sides of a triangle");
        Triangle obj = new Triangle();                                //object is created
        side1 = reader.nextInt();
        side2 = reader.nextInt();                                     //reads input from user
        side3 = reader.nextInt();
        System.out.println("Area is "+obj.getArea(side1,side2,side3));                 //Area is printed
        System.out.println("Perimeter is "+obj.getPerimeter(side1,side2,side3));       //Perimeter is printed


    }
}
