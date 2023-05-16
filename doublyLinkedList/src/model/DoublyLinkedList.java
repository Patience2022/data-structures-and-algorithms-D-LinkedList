package model;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	public DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail= newNode;
		length = 1;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}

	//This method prints Nodes in the Linked list
	
	public void printList()
	{
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	//This method adds a Node at the end
	public void append(int value)
	{
		Node newNode = new Node(value);
		if(head==null)
		{
			head= newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	}
	
	//This method removes the last node from the list
	public Node removeLast()
	{
		Node temp = tail;		
		if(head==null)
		{
			return null;
		}
		if(length == 1)
		{
			head = null;
			tail = null;
		}
		else
		{

		tail = tail.prev;
		tail.next = null;
		temp.prev = null;
		}
		length--;

		return temp;
	}
	
	//This methods adds a node in the beginning of the list
	public void prepend(int value)
	{
		Node newNode = new Node(value);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}
		
		else
		{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;	
		}
		length++;
	}
	
	//This method removes node at the beginning of the list
	public Node removeFirst()
	{
		Node temp = head;
		if(head == null)
		{
			return null;
		}
		
		if(length ==1)
		{
			head = null;
			tail = null;
		}
		else
		{
			head = head.next;
			head.prev = null;
			temp.next = null;
			
		}
		length--;
		return temp;
	}
	
	//This method fetches the value of the node in a given index
	public Node getNode(int index)
	{
		if(index <0 || index >=length) return null;
		Node temp = head;
		if(index <length/2)
		{
			for(int i = 0; i<index; i++)
			{
				temp = temp.next;
			}
		}
	
		else 
		{
			temp = tail;
			for(int i = length-1; i>index; i--)
			{
				temp = temp.prev;
			}
		}
		return temp;
	}

	//This method sets a value at give index
	public boolean setValue(int index, int value)
	{
		Node temp = getNode(index);
		if(temp != null)
		{
			temp.value = value;
			return true;
		}
		return false; 
	}
	
//	This method inserts  a Node to the list
	public boolean insertNode(int index, int value)
	{
		if(index < 0 || index > length)return false;
		if(index==0)
		{
			prepend(value);
			return true;
		}
		if(index==length)
		{
			append(value);
			return true;
		}
			
		Node newNode = new Node(value);
		Node before = getNode(index-1);
		
		Node after = before.next;
		System.out.println(after.value);
		newNode.prev = before;
		newNode.next = after;
		before.next = newNode;
		after.prev = newNode;

		length++;
		return true;
	}
	
// This method removes a node at a particular index
	public Node removeNode(int index)
	{
		if(index == length-1) return removeLast();
		if(index ==0) return removeFirst();
		else {
			Node temp = getNode(index);
			temp.next.prev = temp.next;
			temp.prev.next = temp.next;
			temp.next = null;
			temp.prev = null;
		}
		length--;
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
