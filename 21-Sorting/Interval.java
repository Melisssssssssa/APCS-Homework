import java.util.*;
import java.io.*;

public class Interval implements Comparable{
    private double high, low;
    Random r = new Random();
    private static int numIntervals = 0;
    //static makes memory allocated in the class and belongs in the class, not
    //the instance variable. Helps keep track of things created overall in class
    
    public Interval () {
	low = r.nextInt(10);
	high = r.nextInt(10) + low + 1;
	//+1 so that the numbers won't be the same if the second # is 0
	numIntervals++;
    }
    
    public Interval (double h, double l) {
	low = l;
	high = h;
	numIntervals++;
    }

    public String toString() {
	//String s = "Inteval: "+numIntervals+": "+ "["+low+","+high+"]";
	return "[" + low + "," + high + "]";
    }

    public int compareTo(Object other) {
	/* cast other to the appropriate type and store in a local variable
	   for convenience
	*/
	Interval o = (Interval)other;
	if (this.low > o.low) {
	    return 1;
	} else if (this.low < o.low) {
	    return -1;
	} else {
	    if (this.high > o.high) {
		return 1;
	    } else if (this.high < o.high) {
		return -1;
	    } else {
		return 0;
	    }
	}   
    }

    public static void printstuff() {
	System.out.println("Stuff");
    }
    
    public static void main(String[] args) {
	for (int x = 0;x < 10; x ++) {
	    System.out.println(new Interval());
	}
	Interval ival = new Interval(4,4);
	Interval ival2 = new Interval(4,5);
	System.out.println(ival.compareTo(ival2));
	ival.printstuff(); //normal calling off of an instance
	printstuff(); //since printstuff is static we can call without instance
	Interval.printstuff(); //can also call off from a class

	Interval[] a = new Interval[10];
	for (int i = 0;i < a.length; i ++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));

	String[] sa = {"hello", "frog","absolute","zoo","bagel"};
	System.out.println(Arrays.toString(sa));
	Arrays.sort(sa);
	System.out.println(Arrays.toString(sa));

	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));

	
    }
}
