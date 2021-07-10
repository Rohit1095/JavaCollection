package collectionpkg;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String>al= new ArrayList<String>();
		al.add("Rohit");
		al.add("Kumar");
		al.add("Rathore");
		al.add("Cdgi");
		al.add("Indore");
		al.add("Madhya pradesh");
		
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	
	
	}
	

}
