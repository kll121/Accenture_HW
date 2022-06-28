import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);
        System.out.println("Please, input a whole number: ");
        int a = myInt.nextInt();
        if(a%2 == 0){
            System.out.println(!true);
        }
        else {
            System.out.println(!false);
        }
    }
}
//4) Ask user to input a whole number and output false, if it is even number and true if it is odd number
