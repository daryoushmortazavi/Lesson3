package Assignment5;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int salesClass = 2;
        float commissionRate;
        switch (salesClass) {
            case (1):
                System.out.println(0.02);
                break;
            case (2):
                System.out.println(0.035);
                break;
            case (3):
                System.out.println(0.05);
                break;
            default:
                System.out.println(0);
                break;
        }
    }
}
