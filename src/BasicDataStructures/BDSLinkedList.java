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
            System.out.println("3. Check element at index");
            System.out.println("4. Check index for element");
            System.out.println("5. Remove element");
            System.out.println("6. Clear list" );
            System.out.println("7. Display list");
            System.out.println("8. Exit");
            System.out.print("Please select your option based on the number: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    ll = AddElements(ll);
                    break;
                case 2:
                    ll = AddElementsAtIndex(ll);
                    break;
                case 3:
                    System.out.println("Element: "+GetElementAtIndex(ll));
                    break;
                case 4:
                    System.out.println("Index: "+GetIndexByElement(ll));
                    break;
                case 5:
                    ll = RemoveElement(ll);
                    break;
                case 6:
                    ll.clear();
                    break;
                case 7:
                    System.out.println(ll.toString());
                    break;
                case 8:
                    System.out.println("Exiting...");
                        break outer;
                }


            }
        }

    private static LinkedList RemoveElement(LinkedList<String> ll) {
        System.out.print("Do you want to remove element by value or index: ");
        String ans = sc.next();
        if (ans.equalsIgnoreCase("value")){
            System.out.print("Enter the value of the element: ");
            String value = sc.next();
            ll.remove(value);
            System.out.println("Element removed");
        } else if (ans.equalsIgnoreCase("index")) {
            System.out.print("Enter the value of index: ");
            int index = sc.nextInt();
            ll.remove(index);
            System.out.println("Element removed");
        }else{
            System.out.println("Invalid Input");
        }
        return ll;

    }

    private static int GetIndexByElement(LinkedList<String> ll) {
        System.out.println("Enter the element to be searched: ");
        String element = sc.next();
        return ll.indexOf(element);
    }

    private static String GetElementAtIndex(LinkedList<String> ll) {
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        String element = ll.get(index);
        return element;
    }

    public static LinkedList AddElements(LinkedList ll){
            System.out.print("Enter the number of elements to be added: ");
            int len = sc.nextInt();
            for (int i = 0; i < len; i++) {
                System.out.println("Enter the element at position "+i+": ");
                String element = sc.next();
                ll.add(element);
            }
            return ll;
    }
    public static LinkedList AddElementsAtIndex(LinkedList ll){
        System.out.print("Enter the index at which the element is to be updated: ");
        int index = sc.nextInt();
        System.out.println("Enter the element to be added: ");
        String element = sc.next();
        ll.add(index,element);
        return ll;
    }
    }

