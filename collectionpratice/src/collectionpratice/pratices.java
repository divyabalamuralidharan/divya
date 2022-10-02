package collectionpratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class pratices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(9);
		list.add(9);
		list.add(9);
		list.add(9);
		list.add(9);
		System.out.println(list);
		LinkedList list1=new LinkedList();
		list1.add(9);
		list1.add(9);
		list1.add(9);
		list1.add(9);
		list1.add(9);
		System.out.println(list);
		HashSet set=new HashSet();
		set.add("divya");
		set.add("holo");
		set.add("ajay");
		System.out.println(set);
		TreeSet set1=new TreeSet();
		set1.add("divya");
		set1.add("ayish");
		set1.add("balamuralidharan");
		set1.add("balamuralidharan");
		Iterator i= set1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			
		
		
		
		System.out.println( set1);
		
	}

}
