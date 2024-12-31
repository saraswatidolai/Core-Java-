package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=5;i<10;i++) 
		{
			al.add(i);
		}
		al.remove(4);
		for(int str: al)
			System.out.print(str+" ");
	}
}






/*

public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<10;i++) 
		{
			al.add(i);
		}
		for(int str: al)
			System.out.print(str+" ");
	}
}

*/

/*
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.print(it+" ");
	}
}

*/



/*
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}
*/

/*
public class CollectionExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
		Collections.reverse(list);
		for(String str: list)
			System.out.print(str+" ");
	}
}
*/
