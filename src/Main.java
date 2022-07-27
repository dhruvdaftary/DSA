import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(BinarySearch(new int[]{11, 23, 34, 37, 46, 67},55 ));

    }
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int size = start + ((end - start) / 2);
//            int size = (start+end)/2;
            if (arr[size] == target) {
                return arr[size];
            } else if (arr[size] > target) {
                end = size-1;
            } else if (arr[size] < target) {
                start = size+1;
            }
        }
        return arr[start];
    }
}