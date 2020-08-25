package com.stackroute;
import java.util.Scanner;
class Average {
    int number1;
    int number2;
    int number3;
    public float getAverage() {
        return (number1 + number2 +number3)/3;

    }
}
class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Average obj = new Average();
        System.out.println("Enter three numbers");
        obj.number1 = reader.nextInt();
        obj.number2 = reader.nextInt();
        obj.number3 = reader.nextInt();
        System.out.println("Average is "+obj.getAverage());



    }
}
