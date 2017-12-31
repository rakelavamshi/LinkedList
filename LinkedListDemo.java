import java.util.LinkedList;


public class LinkedListDemo
{
	public static void main(String [] args)
	{
		LinkedList<Integer> link=new LinkedList<Integer>();
		link.add(1);
		link.add(4);
		link.add(5);
		link.add(6);
		System.out.println(link);
		link.add(1,555);
		System.out.println(link);
		link.remove(3);
		System.out.println(link);
		link.removeFirst();
		System.out.println(link);
		link.removeLast();
		System.out.println(link);
		int val=link.get(1);
		link.set(1,val+444);
		System.out.println(link);
		
	}

}
