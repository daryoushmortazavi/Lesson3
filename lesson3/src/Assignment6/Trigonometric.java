package Assignment6;

import static java.lang.Integer.parseInt;

public class Trigonometric {

    public Trigonometric() {
        }

    public float calculateHypotenuse(String side1, String side2) {
        int a = Integer.parseInt(side1);
        int b = Integer.parseInt(side2);
        System.out.println("first side is: " + side1);
        System.out.println("second side is: " + side2);
        float hypotenuse = (float) Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        return hypotenuse;
    }

    public boolean isNumeric(String str){
        int a;
        try{
            a = Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            System.out.println(str + " is not a numeric value, continue entering numbers");
            return false;
        }
    }
}

