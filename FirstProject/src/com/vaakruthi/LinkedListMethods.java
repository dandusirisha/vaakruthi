package com.vaakruthi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMethods {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("America");
		l1.add("India");
		l1.add("Japan");
		l1.add("Pune");
		System.out.println("LinkedList = "+l1);
		Scanner sc = new Scanner(System.in);
		String element;
		int position,choice=0;
		while(choice<17) {
			System.out.println("LinkedList OPERATIONS");
			System.out.println("1. Add an Element");
			System.out.println("2. Remove an Element");
			System.out.println("3. Change an Element");
			System.out.println("4. Add an Element by using boolean return type:");
			System.out.println("5. Add an Element in First position:");
			System.out.println("6. Add an Element in Last position:");
			System.out.println("7. Remove an Element in first element:");
			System.out.println("8. Remove an Element in last element:");
			System.out.println("9. Remove an Element in particular position :");
			System.out.println("10. Get the Element in particluar position:");
			System.out.println("11. getFirst Element :");
			System.out.println("12. getLast Element :");
			System.out.println("13. Size of an linked list:");
			System.out.println("14. Enter the indexOf() :");
			System.out.println("15. Enter the lastIndexOf() :");
			System.out.println("16. Clear the linked list :");
			System.out.println("17. Exit");
			System.out.println("Enter Your Choice:");
			choice =sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter Element:");
				   element = sc.next();
				   System.out.println("At What position? ");
				   position = sc.nextInt();
				   l1.add(position-1, element);
				   break;
			case 2:System.out.println("Enter position:");
			       position = sc.nextInt();
			       l1.remove(position-1);
				   break;
			case 3:System.out.println("Enter position:");
				   position = sc.nextInt();
				   System.out.println("Enter new element:");
				   element = sc.next();
				   l1.set(position-1, element);
				   break;
			case 4:System.out.println("Enter Element by using boolean return type:");	
				   element = sc.next();
				   l1.add(element);
				   break;
			case 5:System.out.println("Enter Element by using void return type addFirst element:");
				   element = sc.next();
				   l1.addFirst(element);
				   break;
			case 6:System.out.println("Enter Element by using void return type addLast element:");
				   element = sc.next();
				   l1.addLast(element);
				   break;
			case 7:System.out.println("removeFirst element:"+l1.removeFirst());
				   break;
			case 8:System.out.println("removeLast element:"+l1.removeLast());
				   break;
			case 9:System.out.println("Enter an Element to remove particular position:");
				   position = sc.nextInt();
				   l1.remove(position-1);
				   break;
			case 10:System.out.println("Enter the element get the particular position:");
					position = sc.nextInt();
					System.out.println(l1.get(position-1));
					break;
			case 11:System.out.println("Enter the element to getFirst() :"+l1.getFirst());
				    break;
			case 12:System.out.println("Enter the element to getLast() :"+l1.getLast());
			        break;
			case 13:System.out.println("Size of the linked list:"+l1.size());
				    break;
			case 14:System.out.println("Enter element to find index:");
				    element = sc.next();
				    int index = l1.indexOf(element);
				    if(index != -1) {
				    	System.out.println("Index of "+element+" is:"+index);
				    }
				    else {
				    	System.out.println(element+" not found in the linked list.");
				    }
					break;
			case 15:System.out.println("Enter element to find last index :");
					element = sc.next();
					int lastIndex = l1.lastIndexOf(element);
					if(lastIndex != -1) {
						System.out.println("Index of "+element+" is:"+lastIndex);
					}
					else {
				    	System.out.println(element+" not found in the linked list.");
				    }
				    break;
			case 16:l1.clear();
			        System.out.println("Linked List cleared successfully..");
			        break;
			default:
				   return;	   
			}
			System.out.print("List="+l1+"\n");
			//Iterator it = l1.iterator();
			//while(it.hasNext())
			//System.out.print(it.next()+" ");
		}
	}
}
