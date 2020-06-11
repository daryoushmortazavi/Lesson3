package Assignment6;

import java.util.Scanner;

public class Main {
    private static
    String firstSide, secondSide, continueFromUser;
    private static float c;

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        boolean continueF = true;
        Trigonometric myTrigonometric = new Trigonometric();

        while (continueF){
            System.out.println("Enter the value of the first side");
            firstSide = sc.next();
            if(!myTrigonometric.isNumeric(firstSide))
                continue;

            System.out.println("Enter the value of the second side");
            secondSide = sc.next();
            if(!myTrigonometric.isNumeric(secondSide))
                continue;

            c = myTrigonometric.calculateHypotenuse(firstSide, secondSide);
            System.out.println("Hypotenuse side is: " + c);

            System.out.println("would you like to continue (y/n)?");
            continueFromUser = sc.next();
            if (continueFromUser.equalsIgnoreCase("n")) {
                System.out.println("Bye");
                continueF = false;
            }
        }
    }
}
