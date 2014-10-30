import java.util.*;

public class  Arraystuff {

   

    private int[] a;
    Random rnd;
  

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }

    public Arraystuff(){
	this(100);
    }
    

   

    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;}

    public int find(int n){
	for(int i = 0;i < a.length;i++){
	    if (a[i] == n){
		return i;
	    }
	}
	return -1;
    }

    public int maxVal(){
	int largest = 0;
	for(int i = 0;i < a.length;i++){
	    if (largest < a[i]){
		largest = a[i];
	    }
	}
	return largest;
    }
    
  

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(100));
	System.out.println(as.maxVal());
	
    }
    
}
