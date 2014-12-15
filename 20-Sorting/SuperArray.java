import java.util.*;
import java.io.*;

public class SuperArray{
    public String[] data;
    public SuperArray(){
    	data = new String[10];
    	for (int j=0;j<data.length;j++){
<<<<<<< HEAD
	    data[j]="";
=======
    		data[j]="";
>>>>>>> 09233ebe3b89a41690fe5c8ea5955780ecdff2ee
    	}
    }
    public SuperArray(int i){
	data = new String[i];
	for (int j=0;j<data.length;j++){
	    data[j]="";
	}
    }
    public boolean add(String i){
    	if (data.length == size()){
	    String[] s = new String[data.length + 10];
	    for (int n=0;n<data.length;n++){
		s[n] = data[n];
	    }
	    data = s;
	    for(int n=0;n<data.length;n++){
		if(data[n].equals("")){
		    data[n] = i;
		    break;
		}
	    }
    	}
    	else{
	    for(int n=0;n<data.length;n++){
		if(data[n].equals("")){
		    data[n] = i;
		    break;
		}
	    }
    	}
	return true;
    }
<<<<<<< HEAD
=======
    public boolean add(String i){
    	if (data.length == size()){
	    String[] s = new String[data.length + 5];
	    for (int n=0;n<data.length;n++){
		s[n] = data[n];
	    }
	    data = s;
	    for(int n=0;n<data.length;n++){
		if(data[n].equals("")){
		    data[n] = i;
		    break;
		}
	    }
    	}
    	else{
	    for(int n=0;n<data.length;n++){
		if(data[n].equals("")){
		    data[n] = i;
		    break;
		}
	    }
    	}
	return true;
    }
>>>>>>> 09233ebe3b89a41690fe5c8ea5955780ecdff2ee
   
    public void add(int index, String i){
    	if (data.length>size()){
	    if (data[index].equals("")){
		data[index] = i;
	    }
	    else{
		for(int n=data.length-1;n>index;n--){
		    data[n] = data[n-1];
		}
		data[index] = i;
	    }
    	}
    	else{
	    String[] s = new String[data.length + 5];
	    for (int n=0;n<data.length;n++){
		s[n] = data[n];
	    }
	    data = s;
	    if (data[index].equals("")){
		data[index] = i;
	    }
	    else{
		for(int n=data.length-1;n>index;n--){
		    data[n] = data[n-1];
		}
		data[index] = i;
	    }
    	}
    	
    }
    public int size(){
    	int m = 0;
    	for(int i=0;i<data.length;i++){
	    if (data[i].compareTo("")<0){
		m++;
	    }
    	}
    	return m;
    }
    public String get(int index){
    	return data[index];
    }
    public String set(int index, String i){
    	String s = data[index];
    	data[index] = i;
    	return s;
    }
    public String remove(int index){
    	String s = data[index];
    	data[index] = "";
    	return s;
    }
    public String toString(){
	String s = "";
	for (int i=0;i<data.length;i++){
	    s = s + "Element at " + i + "==>" + data[i] + "\n";
	}
	return s;
    }
    
    public void isort(){
    	for (int i=0;i<data.length;i++){
	    int k=0;
	    String newvalue = data[i];
	    for (k = i; k > 0 && newvalue.compareTo(data[k-1])<0;k--){
    		data[k] = data[k-1];
	    }
	    data[k]=newvalue;
    	}
    }
    
    public void ssort(){
	String t;
	String s;
	int k = 0;
	for (int i=0;i<data.length;i++){
	    t = data[i];
	    s = data[i];
	    k = i;
	    for (int n=i;n<data.length;n++){
	        if (t.compareTo(data[n]) > 0){
		    t = data[n];
		    k = n;
		}
	    }
	    data[k] = s;
	    data[i] = t;
	}
    }
    public void bsort(){
    	String t;
    	String s;
    	int counter = 0;
    	while (counter<data.length){
<<<<<<< HEAD
	    for (int i=0;i<data.length-1;i++){
		s = data[i+1];
		t = data[i];
		if (t.compareTo(s)>0){
		    data[i] = s;
		    data[i+1] = t;
		    counter = 0;
		}
		else{
		    counter++;
		}
	    }
    	}
    }
    public void builtin() {
	/* this sorts the whole array, if you want to sort only some of it
	   you would write Arrays.sort(data,0,n) where n is the index beyond the 
	   stopping point */
			 
	Arrays.sort(data);

	/* for an ArrayList, you would use Collections.sort(list) */
    }
    public static void main(String[] args){
	SuperArray s = new SuperArray(10);
	s.add("hi");
	s.add("hello");
	s.add("hola");
	s.add("ciao");
	s.add("bonjour");
	s.add("namaste");
	s.add("konichiwa");
	s.add("salut");
	s.add("ola");
	s.add("aloha");
	s.add("gutentag");
	s.add("ahoj");
	s.add("nihao");
	s.add("salve");
	s.add("salam");
	s.add("salud");
	s.builtin();
	System.out.println(s.toString());
    }
}

=======
    		for (int i=0;i<data.length-1;i++){
    			s = data[i+1];
    			t = data[i];
    			if (t.compareTo(s)>0){
    				data[i] = s;
    				data[i+1] = t;
    				counter = 0;
    			}
    			else{
    				counter++;
    			}
    		}
    	}
    	public static void main(String[] args){
    		SuperArray s = new SuperArray(10);
    		s.add("hi");
    		s.add("hello");
    		s.add("hola");
    		s.add("ciao");
    		s.add("bonjour");
    		s.add("namaste");
    		s.add("konichiwa");
    		s.add("salut");
    		s.add("ola");
    		s.add("aloha");
    		s.add("gutentag");
    		s.add("ahoj");
    		s.add("nihao");
    		s.add("salve");
    		s.add("salam");
    		s.add("salud");
    		s.bsort();
    		System.out.println(as.toString());
    	}
    }
>>>>>>> 09233ebe3b89a41690fe5c8ea5955780ecdff2ee
