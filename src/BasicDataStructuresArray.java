import java.util.Arrays;
import java.util.Scanner;

public class BasicDataStructuresArray {
    public static void main(String[] args) {
        //Array literal
        int[] newarray = new int[10]; //initializing a new array of type integer and length 10
        System.out.println("Initial array");
        System.out.println(Arrays.toString(newarray)); //print array in string format
        //for adding elements using a for loop
        for (int i = 0; i < newarray.length; i++) {
            System.out.print("Enter element at position "+i+": ");
            Scanner sc = new Scanner(System.in);
            newarray[i] = sc.nextInt();
        }
        System.out.println("Final array");
        System.out.println(Arrays.toString(newarray));//printing final array

    }
}
