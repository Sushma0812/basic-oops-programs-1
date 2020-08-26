package com.stackroute;
class Student {                                                    // class is created
    String name;                                                   //variable is declared
    int roll_no;                                                   //variable is declared
    int phone_no;
    String address;
}

class Student1 {                                                    // class is created

    public static void main(String[] args) {
        Student obj1  = new Student();                               //object is created
        Student obj2 = new Student();
        obj1.name = "Sam";                                           //name is initialized
        obj1.roll_no = 1;                                             // roll_no is initialized
        obj1.phone_no = 12234;
        obj1.address = "Hyderabad";
        System.out.println("Name is " + obj1.name + " and roll number is " + obj1.roll_no+ " phone number is "+obj1.phone_no+" and address is "+obj1.address);          //print the values

        obj2.name = "John";                                           //name is initialized
        obj2.roll_no = 2;                                             // roll_no is initialized
        obj2.phone_no =23415;
        obj2.address = "Banglore";
        System.out.println("Name is " + obj2.name + " and roll number is " + obj2.roll_no+ " phone number is "+obj2.phone_no+" and address is "+obj2.address);          //print the values



    }
}
