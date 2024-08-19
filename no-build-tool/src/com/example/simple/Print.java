package com.example.simple;

public class Print {
    static public void Print() {
        
        System.out.println("Hello World");

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        byte myNum = 100;
        System.out.println(myNum);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); // Outputs true
        System.out.println(isFishTasty); // Outputs false

        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));

        String result = String.format("Hello %s! One kilobyte is %,d bytes.", "World", 1024);
        System.out.println(result);
    }
}
