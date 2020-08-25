package com.stackroute;
class Student {                                                    // class is created
    String name;                                                   //variable is declared
    int roll_no;                                                   //variable is declared
}

class Student1 {                                                    // class is created

    public static void main(String[] args) {
        Student obj = new Student();                                 //object is created
        obj.name = "John";                                           //name is initialized
        obj.roll_no = 2;                                             // roll_no is initialized
        System.out.println("Name is " + obj.name + " and roll number is " + obj.roll_no);          //print the values

    }
}