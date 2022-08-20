package KunalKushwaha;

import java.util.Scanner;

public class ceiling {
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
    }
    public int ceiling(int[] arr, int target){
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
}
