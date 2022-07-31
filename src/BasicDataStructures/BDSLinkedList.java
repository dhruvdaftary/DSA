package BasicDataStructures;

import java.util.Scanner;
import java.util.LinkedList;
public class BDSLinkedList {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();;

        outer: while(true){
            System.out.println("1. Add elements");
            System.out.println("2. Add element at particular index");
            System.out.println("3. Clear list" );
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Please select your option based on the number: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    ll = AddElements(ll);
                    break;
                case 4:
                    System.out.println(ll.toString());
                case 5:
                    break outer;
                }


            }
        }
        public static LinkedList AddElements(LinkedList ll){
            System.out.println("Enter the number of elements to be added: ");
            int len = sc.nextInt();
            for (int i = 0; i < len; i++) {
                System.out.println("Enter the element at position "+i+": ");
                String element = sc.next();
                ll.add(element);
            }
            return ll;
    }
    public static LinkedList AddElementsAtIndex(LinkedList ll){
        return ll;
    }
    }

