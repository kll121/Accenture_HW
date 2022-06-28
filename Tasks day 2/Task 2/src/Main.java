import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner forBool = new Scanner(System.in);
        System.out.println("Enter b1: ");
        boolean b1 = forBool.nextBoolean();
        System.out.println("Enter b2: ");
        boolean b2 = forBool.nextBoolean();

        if(b1 == b2) {
            System.out.println("Is b1 and b2 equal? - true");
        }
        else {
            System.out.println("Is b1 and b2 equal? - false");
        }
    }
}