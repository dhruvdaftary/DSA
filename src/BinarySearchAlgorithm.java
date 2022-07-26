import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array in sorted form");
        System.out.print("Enter the size of the array: ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; i++) {
            System.out.print("Enter the element at position " + i +": ");
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();
        System.out.println("The entered array is");
        System.out.println(Arrays.toString(arr));
        System.out.println("The target element is present at index "+BinarySearch(arr,target));
    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int size = 1;
        while (size>1){
            size = (start+end)/2;
            if(arr[size] == target){
                return size;
            }
            else if(arr[size]>target){
                end = size;
            }
            else if(arr[size/2]<target){
                start = size;
            }
        }
        return -1;
    }
}
