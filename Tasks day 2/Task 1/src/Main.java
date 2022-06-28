import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner forNum = new Scanner(System.in);
        System.out.println("Enter the 1st number to be compared: ");
        double x = forNum.nextDouble();
        System.out.println("Enter the 2nd number to be compared: ");
        double y = forNum.nextDouble();
        if (x == y) {
            System.out.println("is " + x + " equal to " + y + " - true");
        }
        else {
            System.out.println("is " + x + " equal to " + y + " - false");
        }
        if(x < y) {
            System.out.println("is " + x + " less than " + y + " - true");
        }
        else {
            System.out.println("is " + x + " less than " + y + " - false");
        }
        if (x < y || x == y) {
            System.out.println("is " + x + " less or equal to " + y + " - true");
        }
        else {
            System.out.println("is " + x + " less or equal to " + y + " - false");
        }
        if (x > y){
            System.out.println("is " + x + " greater than " + y + " - true");
        }
        else {
            System.out.println("is " + x + " greater than " + y + " - false");
        }
        if(x > y || x == y){
            System.out.println("is " + x + " greater or equal to " + y + " - true");
        }
        else{
            System.out.println("is " + x + " greater or equal to " + y + " - false");
        }


    }
}


