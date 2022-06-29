public class Main {
    public static void main(String[] args) {

        int[] arr = {-10, 68, 12, 5};
        int[] otherArr = new int[arr.length];
        System.out.println("Copied array: ");
        for (int i = 0; i < arr.length; i++) { //for-each loop only used to loop through arrays
            otherArr[i] = arr[i];
            System.out.print(otherArr[i] + " ");
        }
        System.out.println();
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
    }
}
/* 2) Declare and initialize an array with four arbitrary whole numbers.
// Write a Java program to copy this array by iterating it.
*/