package com.stackroute;                                   // it is the package
import java.util.Scanner;                                 // Scanner class is imported from java.util
class Triangle{                                           // class is created
    int a,b,c;                                            // Declaration of variables
    public double getArea()                               //Method is created
    {
        double s = (a+b+c)/2.0;                           //Area is calculated
        return Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
    }
    public double getPerimeter()                          //Method is created
    {
        return (a+b+c)/2.0;                               //Perimeter is calculated
    }
}

class Main {                                               //class is created

    public static void main(String[] args) {                           //Main method
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter sides of a triangle");
        Triangle obj = new Triangle();                                //object is created
        obj.a = reader.nextInt();
        obj.b = reader.nextInt();                                     //reads input from user
        obj.c = reader.nextInt();
        System.out.println("Area is "+obj.getArea());                 //Area is printed
        System.out.println("Perimeter is "+obj.getPerimeter());       //Perimeter is printed
    }
}
