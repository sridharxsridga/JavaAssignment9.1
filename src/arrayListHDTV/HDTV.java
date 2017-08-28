/*
 * class HDTV with the properties:• Brandname • Size
 */

package arrayListHDTV;

import java.util.Comparator;


public class HDTV {

	private String brandName;
	private int size;

	//Constructor to initialize properties
	public HDTV(String brandName, int size) {
		this.brandName = brandName;
		this.size = size;
	}
// getter method for brandName
	public String getBrandName() {
		return brandName;
	}
	// setter method for brandName
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	// getter method for size
	public int getSize() {
		return size;
	}

	// setter method for size
	public void setSize(int size) {
		this.size = size;
	}
//overriding toString method of `object class to dispay properties of HDTV class
	public String toString() {
		return "HDTV[Brand Name: " + this.brandName + " size: " + this.size + "]";
	}

}
