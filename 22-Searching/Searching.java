import java.util.*;
import java.io.*;

public class Searching{

    int[] list;
    Random r = new Random();
    
    public Searching(){
	this(10);
    }
    public Searching(int n){
        list = new int[n];
	for (int i = 0; i<n; i++){
	    list[i] = r.nextInt(n);
	}
	Arrays.sort(list);
    }
    
    public String toString(){
	String blah = "";
	for (int i = 0; i<list.length; i++){
	    blah += list[i] + " ";
	}
	return blah;
    }

    public int addItem(){
	int[] temp = new int[list.length+1];
	for (int i = 0; i<temp.length

    public static void main(String[] args){
	Searching s = new Searching();
	System.out.println(s.toString());
    }
}
