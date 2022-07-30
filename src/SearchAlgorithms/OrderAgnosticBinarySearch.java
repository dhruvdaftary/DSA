package SearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {
//    For both ascending and descending arrays
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
        if(arr[0]>arr[arr.length-1]){
            System.out.println("The target element is present at index " + BinarySearchDescending(arr,target));
//
        } else if ((arr[0]<arr[arr.length-1])) {
            System.out.println("The target element is present at index " + BinarySearchAscending(arr,target));
        }

    }

    static int BinarySearchAscending(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
//            size = start+((end-start)/2);
            int size = (start+end)/2;
            if(arr[size] == target){
                return size;
            }
            else if(arr[size]>target){
                end = size-1;
            }
            else if(arr[size]<target){
                start = size+1;
            }
        }
        return -1;
    }

    static int BinarySearchDescending(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
//            size = start+((end-start)/2);
            int size = (start+end)/2;
            if(arr[size] == target){
                return size;
            }
            else if(arr[size]<target){
                end = size-1;
            }
            else if(arr[size]>target){
                start = size+1;
            }
        }
        return -1;
    }
}
