package com.stackroute;
/*
 *class is created to declare variables
 */

class Student {
    String name;                                                   //variable is declared
    int roll_no;                                                   //variable is declared
}

class StudentDetails {                                                    // class is created

    public static void main(String[] args) {
        Student student = new Student();                                 //object is created
        student.name = "John";                                           //name is initialized
        student.roll_no = 2;                                             // roll_no is initialized
        System.out.println("Name is " + student.name + " and roll number is " + student.roll_no);          //print the values

    }
}