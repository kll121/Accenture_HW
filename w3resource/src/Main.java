///////////////////////////////////////////////
//IF YOU WANT TO RUN A SPECIFIC EXERCISE, DELETE THE COMMENT COMMENT SIGNS (/*,*/) AROUND THE SPECIFIC TASK
/*import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors  = new ArrayList<>();
        colors.add("purple");
        colors.add("magenta");
        colors.add("black");
        colors.add("white");
        colors.add("blue");
        System.out.println(colors);
    }
}
*/
/*1. Write a Java program to create a new array list, add some colors (string) and print out the collection*/
///////////////////////////////////////////////////////
//3. Write a Java program to insert an element into the array list at the first position.
/*import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors  = new ArrayList<>();
        colors.add("purple");
        colors.add("magenta");
        colors.add("black");
        colors.add("white");
        colors.add("blue");
        colors.add(0, "red");
        System.out.println(colors);
    }
}
*/
///////////////////////////////////////////////////////////
//5. Write a Java program to update specific array element by given element.
/*import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors  = new ArrayList<>();
        colors.add("purple");
        colors.add("magenta");
        colors.add("black");
        colors.add("white");
        colors.add("blue");
        System.out.println(colors);
        colors.set(0, "red");
        System.out.println(colors);
    }
}
*/
//////////////////////////////////////////////////////////////////
//7. Write a Java program to search an element in a array list
/*import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors  = new ArrayList<>();
        String el ="white";
        colors.add("purple");
        colors.add("magenta");
        colors.add("black");
        colors.add("white");
        colors.add("blue");
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i) == el){
                System.out.println("Found a match: " + colors.get(i));
                break;
            }
        }

    }
}
 */
/////////////////////////////////////////////////////////////////////
//11.Write a Java program to reverse elements in an array list
/*import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors  = new ArrayList<>();
        int size;
        String x, y;

        colors.add("purple");
        colors.add("magenta");
        colors.add("black");
        colors.add("white");
        colors.add("blue");
        colors.add("pink");
        System.out.println(colors);
        for (int i = 0; i < colors.size(); i++) {
            size = colors.size();

            x = colors.get(i); //purple
            y = colors.get(size-i-1); //
            colors.set((size-i-1), x); //not finished
            colors.set(i, y);
            if((i == (size/2)) && size%2 ==1){
                break;
            }
            if((i == ((size/2)-1)) && size%2 ==0){
                break;
            }
        }
        System.out.println("reversed " + colors);
    }
}
*/
