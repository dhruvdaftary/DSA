import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            System.out.print("Enter the element at position " + i +": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The given array is ");
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length-1;
        while(end>start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        };
        System.out.println("The reversed array is ");
        System.out.println(Arrays.toString(arr));
    }
}