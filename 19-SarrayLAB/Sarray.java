import java.util.*;

public class Sarray{
    String[] data;
    String[] last;
    Random r;
    

    public Sarray(String i){
	data = new String[i];
	last = 0;
	r = new Random();
	for (int n = 0; n <data.length; n++){
	    data[n] = r.nextInt(10);
	}
    }

    public String toString(){
	String f ="";
	for (int i =0; i< data.length; i++){
	    f = f +data[i] + ",";
	    if ( i.equals(data.length - 1)){
		f = f + data[i];
	    }
	}
	return f;
    }

    public void lengthen(){
	if (last >= data.length){
	    String[] ans = new String[data.length +10];
	    for (int i = 0; i <data.length; i++){
		ans[i] = data[i];
	    }
	    data = ans;
	}
    }


    public boolean add (String i){
	lengthen();
	i = data[data.length -1];
	last = last + 1;
	return true;
    }

   
