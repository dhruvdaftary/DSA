package BasicDataStructures;

import java.util.Scanner;
import java.util.LinkedList;
public class BDSLinkedList {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = 0;
        while(true){
        System.out.println("Do you want to create a Linked List for integers or strings: ");
        String ans = sc.next();
        if(ans.equalsIgnoreCase("strings")){
            System.out.println("New linked list for strings created");
            type = 1;
            break;
        } else if (ans.equalsIgnoreCase("integers")) {
            System.out.println("New linked list for integers created");
            type = 2;
            break;
        }else {
            System.out.println("Invalid Input");
            continue;
        }
        }
        System.out.println(type);
        LinkedList<String> ll = new LinkedList<String>();

        while(true){
//            if(type==1){ LinkedList<String> ll = new LinkedList<String>();}
//            else {LinkedList<Integer> ll = new LinkedList<Integer>();}
            System.out.println("1. Add elements");
            System.out.println("2. Add element at particular index");
            System.out.println("3. Clear list" );
            System.out.println("4. Display list");
            System.out.print("Please select your option based on the number: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    ll = AddElements(ll,type);
                    break;
                case 4:
                    System.out.println(ll.toString());
                }

            }
        }




        public static LinkedList AddElements(LinkedList ll, int type){
            System.out.println("Enter the number of elements to be added: ");
            int len = sc.nextInt();
            if (type==1){
                for (int i = 0; i < len; i++) {
                    System.out.println("Enter the element at position "+i+": ");
                    String element = sc.next();
                    ll.add(element);
                }
            } else if (type==2) {
                for (int i = 0; i < len; i++) {
                    System.out.println("Enter the element at position "+i+": ");
                    int element = sc.nextInt();
                    ll.add(element);
                }
            }
            return ll;
    }
    public static LinkedList AddElementsAtIndex(LinkedList ll){
        return ll;
    }
    }

