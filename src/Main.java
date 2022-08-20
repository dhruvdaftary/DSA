import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        global: while (true){
        for(int i = 0;i<10;i++){
            System.out.println(i);
            if(i==3){
                break global;
            }
        }
        }
    }

}