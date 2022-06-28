import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);
        System.out.println("Please, input a whole number: ");
        int a = myInt.nextInt();
        if(a%2 == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
/*3) Ask user to input a whole number and output true, if it is even number and false if it is odd number
    Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)-
*/