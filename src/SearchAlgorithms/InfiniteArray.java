package SearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,10,11,14,15,18,19,22,24,26,28,29,40,43,46,49,99};
        int target = 49;
        int size = 1;
        int start = 0;
        global: while(true){
            int end = start+size;
            System.out.println(start+","+end);
            if(arr[end]<target){
                start = end+1;
                size = size*2;
            }else{
                System.out.println(BinarySearch(arr,target,start,end));
                break global;
            }
        }
    }


    static int BinarySearch(int[] arr, int target,int start,int end){
//        int start = 0;
//        int end = arr.length-1;
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
