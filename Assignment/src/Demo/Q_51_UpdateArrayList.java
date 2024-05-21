package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q_51_UpdateArrayList {

	public static void main(String[] args) {

		List list1 = new ArrayList();
		list1.add("Java");
		list1.add("PHP");
		list1.add("SQL");
		list1.add("JQuery");
		list1.add("HTML");
		list1.add("CSS");
		System.out.println("ArrayList of Element :");
		Iterator itr = list1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		list1.add(3, "Nodejs");

		System.out.println("Update new array List of element :");
		for (Object object : list1) {
			System.out.println(object);
		}

	}

}