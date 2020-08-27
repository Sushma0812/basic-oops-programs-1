package com.stackroute;

class Student {                                                    // class is created
    String name;                                                   //variable is declared
    int roll_no;                                                   //variable is declared
    int phone_no;
    String address;
}

class StudentDetails {                                                    // class is created

    public static void main(String[] args) {
        Student studentOne = new Student();                               //object is created
        Student studentTwo = new Student();
        studentOne.name = "Sam";                                           //name is initialized
        studentOne.roll_no = 1;                                             // roll_no is initialized
        studentOne.phone_no = 12234;
        studentOne.address = "Hyderabad";
        System.out.println("Name is " + studentOne.name + " and roll number is " + studentOne.roll_no + " phone number is " + studentOne.phone_no + " and address is " + studentOne.address);          //print the values

        studentTwo.name = "John";                                           //name is initialized
        studentTwo.roll_no = 2;                                             // roll_no is initialized
        studentTwo.phone_no = 23415;
        studentTwo.address = "Banglore";
        System.out.println("Name is " + studentTwo.name + " and roll number is " + studentTwo.roll_no + " phone number is " + studentTwo.phone_no + " and address is " + studentTwo.address);          //print the values


    }
}
