package Assignment3;

import static java.lang.Math.min;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 10, b = 15, c = 0;
        String r = "The minimum value of " + a + " & " + b + " is: ";
        c = min (a, b);
        System.out.println(r + c);
    }
}
