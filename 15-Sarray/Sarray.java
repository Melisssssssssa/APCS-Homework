import java.util.*;

public class Sarray {
    int[] data;
    int   last;
    Random r;

    public Sarray(int i) {
        data = new int[i];
	last = 0;
	r = new Random();
	for (int n = 0; n < data.length; n++) {
	    data[n] = r.nextInt(10);
	}
    }

    public String toString() {
	String f = "";
	for (int i = 0; i < data.length; i++) {
	    f = f + data[i] + ", ";
	    if (i == data.length - 1) {
		f = f + data[i];
	    }
	}
	return f;
    }
    
     public void lengthen() {
	if (last >= data.length) {
	    int[] ans = new int[data.length + 10];
	    for (int i = 0; i < data.length; i++){
		ans[i] = data[i];
	    }
	    data = ans;
	}
    }

    public boolean add(int i){
        lengthen();
	i = data[data.length - 1];
	last = last + 1;
	return true;
    }

    public void  add(int index, int i){
        if (index <= data.length - 1) {
	    for (int n = last; n > 0; n--) {
		if (n > index) {
		    data[n] = data[n - 1];
		} else if (i == index) {
		    data[i] = n;
		    last = last + 1;
		}
	    }
	} else {
	    throw new ArrayIndexOutOfBoundsException();
	}

    }
    
    public int size() {
	int c = 0;
	for (int i = 0; i < data.length; i++) {
	    if (data[i] < 0 || data[i] > 0 || data[i] == 0) {
		c++;
	    } else {
		c = c;
	    }
	}
	return c;
    }
    
    public int get(int index) {
        if (index <= data.length - 1) {
	    return data[index];
	} else {
	    throw new ArrayIndexOutOfBoundsException();
	}
    }

    public int set(int index, int i){
        if (index <= data.length - 1) {
	    int p = data[index];
	    data[index] = i;
	    return p;
	} else {
	    throw new ArrayIndexOutOfBoundsException();
	}
    }

    public int remove(int index){
	if (index <= data.length - 1) {
	    int p = data[index];
	    int[] f = new int[data.length - 1];
	    for (int i = 0; i < last; i++) {
		if (i != index) {
		    f[i] = data[i];
		}
	    }
	    data = f;
	    last = last - 1;
	    return p;
	} else {
	    throw new ArrayIndexOutOfBoundsException();
	}
    }
}
