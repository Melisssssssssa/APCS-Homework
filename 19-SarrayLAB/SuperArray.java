public class SuperArray {
    public String[] data;
    public SuperArray(){
    	data = new String[10];
    	for (int j=0;j<data.length;j++){
    		data[j]="";
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
	    String[] s = new String[data.length + 5];
	    for (int m=0;m<data.length;m++){
		s[m] = data[m];
	    }
	    data = s;
	    for(int j=0;j<data.length;j++){
		if(data[j].compareTo("") == 0){
		    data[j] = i;
		    break;
		}
	    }
    	}
    	else{
	    for(int k=0;k<data.length;k++){
		if(data[k].compareTo("") == 0){
		    data[k] = i;
		    break;
		}
	    }
    	}
	return true;
    }
    public void add(int index, String i){
    	if (index > data.length - 1 || index < 0){
	    throw new ArrayIndexOutOfBoundsException();
    	}
    	if (data.length>size()){
	    if (data[index].compareTo("") == 0){
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
	    if (data[index].compareTo("") == 0){
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
    	int result = 0;
    	for(int i=0;i<data.length;i++){
	    if (data[i].compareTo("") < 0){
		result = result + 1;
	    }
    	}
    	return result;
    }
    public String get(int index){
    	return data[index];
    }
    public String set(int index, String i){
    	String result = data[index];
    	data[index] = i;
    	return result;
    }
    public String remove(int index){
    	String result = data[index];
    	data[index] = "";
    	return result;
    }
    public String toString(){
	String s = "";
	for (int i=0;i<data.length;i++){
	    s = s + "Element " + i + " is " + data[i] + "\n";
	}
	return s;
    }
    
    public static void main(String[] args){
	SuperArray s = new SuperArray(10);
	System.out.println(s.toString());
    }
}
