/*
 * SizeComparator sort the HDTV class  by size ordering using the Comparator class which provides an ordering for collections of objects 
 */
package arrayListHDTV;

import java.util.Comparator;

/**
 * @author sridhar
 *
 */
public class SizeComparator implements Comparator<HDTV> {
/*
 * Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
 * (non-Javadoc)
 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
 */
	@Override
	public int compare(HDTV o1, HDTV o2) {
		HDTV hdtv1 = (HDTV) o1;
		HDTV hdtv2 = (HDTV) o2;
		if (hdtv1.getSize() > hdtv2.getSize())
			return 1; // Returns a positive integer when first argument is greater than the second
		else if (hdtv1.getSize() < hdtv2.getSize())
			return -1;//. Returns a negative integer when first argument is less than the second
		else
			return 0;// Returns 0  when first argument is same as  the second

	}

}
