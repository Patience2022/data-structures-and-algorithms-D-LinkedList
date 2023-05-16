package model;

public class Main {

	public static void main(String[] args) {
	
		DoublyLinkedList dList = new DoublyLinkedList(5);
		dList.append(4);
		dList.append(2);
		dList.append(9);
		
		
		
		System.out.println("The value of node at a given index is: "+dList.getNode(2).value+"\n");

		System.out.println("The value of head is : "+dList.getHead().value);
		System.out.println("The value of tail is : "+dList.getTail().value);
		System.out.println("The size of this list is : "+dList.getLength());
		System.out.println("The elements of the list are: ");
		dList.printList();
		
		dList.removeLast();
		System.out.println("\n"+"The elements of the list after removing last Node: ");
		
		dList.printList();
		
		dList.prepend(6);
		System.out.println("\n"+"The elements of the list after prepend: ");
		dList.printList();
		
		dList.removeFirst();
		System.out.println("\n"+"The elements of the list after removing first: ");
		dList.printList();	
		
		dList.insertNode(2, 8);
		System.out.println("\n"+"The elements of the list after INSERT: ");
		dList.printList();	
		
		dList.removeNode(3);
		System.out.println("\n"+"The elements of the list after REMOVING node at index 3: ");
		dList.printList();	
	}

}
