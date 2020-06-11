package Assignment2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 3, b =4;
        float c = (float) Math.sqrt((pow(a,2) + pow (b,2)));
        System.out.println("Side a is " + a + " , Side b is: " + b + " , Hpotenuse is: " + c);
    }
}

