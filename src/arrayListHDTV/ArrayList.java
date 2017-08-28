/*
 * This class implements arraylist of HDTV objects, and are sorted based on size
 */
package arrayListHDTV;

import java.util.Collections;
import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {

		HDTV hdtv1 = new HDTV("Samsung", 21);//object 1 of HDTV
		HDTV hdtv2 = new HDTV("Sony", 19);//object 2 of HDTV
		HDTV hdtv3 = new HDTV("Samsung", 27);//object 3 of HDTV
		java.util.ArrayList<HDTV> list = new java.util.ArrayList<HDTV>(); //Creating an arraylist to store the objects of HDTV class
		list.add(hdtv1);//Appends the specified element to the end of this list
		list.add(hdtv2);//Appends the specified element to the end of this list
		list.add(hdtv3);//Appends the specified element to the end of this list
		Collections.sort(list, new SizeComparator());//Sorting object using comparator
		System.out.println("HDTV in order of size");
		Iterator iterator = list.iterator(); //Iterator to iterate the elements in the ist
		while (iterator.hasNext()) {// Print the objects present in the list
			System.out.println(iterator.next());
		}

	}

}
