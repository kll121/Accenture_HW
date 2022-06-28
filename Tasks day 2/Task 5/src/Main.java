import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner forBool = new Scanner(System.in);
        System.out.println("Enter a boolean value: ");
        boolean b1 = forBool.nextBoolean();
        System.out.println("Opposite of \"" + b1 + "\" is \"" + !b1 + "\"" );

    }
}
/*5) Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
        Enter boolean value: true
    Expected output:
        Opposite of "true" is "false"
*/