import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	ArrayList<Integer> ai;
	ai = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0; i<20;i++) {
	    ai.add(r.nextInt(20));
	}
	System.out.println(ai);
    
	int i = 0;
	while (i < ai.size()-1){
	    if (ai.get(i) == ai.get(i+1)) {
		ai.remove(i);
	    }
	    else {
		i++;
	    }
	}
	System.out.println(ai);
    }
}
