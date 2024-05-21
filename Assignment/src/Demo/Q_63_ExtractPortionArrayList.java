/*Write a Java program to extract a portion of an array list.*/
package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q_63_ExtractPortionArrayList {

	public static void main(String[] args) {

		try {
			List list = new ArrayList();

			list.add(12);
			list.add("java");
			list.add('g');
			list.add(234.33);
			list.add(false);
			list.add(122354);
			list.add("new data");

			Iterator itr = list.iterator();

			while (itr.hasNext()) {
				System.out.println(itr.next());

			}

			List li = list.subList(2, 5);
			System.out.println("\nextract a portion of an array list :");

			Iterator itr1 = li.iterator();

			while (itr1.hasNext()) {
				System.out.println(itr1.next());

			}

		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();

		} catch (IllegalArgumentException e) {
			e.printStackTrace();

		}

	}
}
