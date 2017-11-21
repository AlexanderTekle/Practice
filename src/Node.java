import java.util.*;

public class Node
{
	public int data;
	public Node next;
	
	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	public static void main (String args[])
	{
		LinkedList test = new LinkedList(new Node(0,null));
		for (int i = 1; i < 6; i++)
		{
			test.append(i);
		}
		
		System.out.println(test);
		
		test.reverse();
		
		System.out.println(test);
		
	}
}

class LinkedList {
	Node head;
	
	public LinkedList (Node head)
	{
		this.head = head;
	}
	
	public void append(int data)
	{
		if (head == null)
		{
			head = new Node(data,null);
		}
		else
		{
			Node temp = head;
			while (temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = new Node(data, null);
		}
	}
	
	public void prepend(int data)
	{
		head = new Node (data, head);
	}
	
	public void delete(int data)
	{
		if (head == null)
			return;
		if (head.data == data)
		{
			head = head.next;
			return;
		}
		
		Node temp = head;
		while (temp.next != null)
		{
			if (temp.next.data == data)
			{
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
	}
	
	public String toString()
	{
		String ret = "";
		if (head == null)
		{
			return "";
		}
		Node temp = head;
		while (temp != null)
		{
			ret += temp.data + " ";
			temp = temp.next;
		}
		return ret;
	}
	
	public void reverse()
	{
		Node curr = head;
		Node next = null;
		Node prev = null;
		 
		 while (curr != null)
		 {
			 next = curr.next;
			 curr.next = prev;
			 prev = curr;
			 curr = next;
		 }
		 head = prev;
	}
	
	public void reverse2()
	{
		Node curr = head;
		Node prev = null;
		Node next = null;
		while (curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
}














/*
public class Node {
	public int data;
	public Node next;
	
	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}
 class LinkedList {
	Node head;
	
	public LinkedList(Node head)
	{
		this.head = head;
	}
	
	public void append(int data)
	{
		if (head == null)
			head = new Node(data,null);
		else {
			Node temp = head;
			
			while (temp.next != null)
				temp=temp.next;
			temp.next = new Node(data,null);
		}
	}
	
	public void prepend(int data)
	{
		head = new Node (data, head);
	}
	
	public void delete(int data)
	{
		if (head == null)
			return;
		if (head.data == data)
			head = head.next;
		Node current = head;
		while (current.next != null)
		{
			if (current.next.data == data)
			{
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
			
	}

}*/
