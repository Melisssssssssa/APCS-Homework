import java.io.*;
import java.util.*;

public class OrderedSuperArray extends SuperArray{
	public String[] data;
    public static void main(String[] args){
	OrderedSuperArray osa = new OrderedSuperArray(10);
	osa.add("hi");
	osa.add("heythere");
	osa.add("hola");
	osa.add("bonjour");
	osa.add("ciao");
	System.out.println(osa.toString());
    }
    public OrderedSuperArray(int i){
	data = new String[i];
	for (int j=0;j<data.length;j++){
    	data[j]="";
    }
    }
    public void add(int index, String i){
	int length = i.length();
	int j = 0;
	while (length <= super.get(j).length()){
	    j++;
	}
	super.add(j, i);
    }
    public boolean add(String i){
	int length = i.length();
	int j = 0;
	while (length <= super.get(j).length()){
	    j++;
	}
	super.add(j, i);
	return true;
    }
}
