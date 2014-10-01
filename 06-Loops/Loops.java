public String frontTimes(String str, int n) {
    String retStr="";
    if (str.length()<=3){
	while(n>0){
	    retStr= retStr+str;
	    n = n - 1;
	}
    }else{
	String ph=str.substring(0,3);
	while(n>0){
	    retStr= retStr+ph;
	    n = n - 1;
	}}
    return retStr;
}

//15 min



public String stringBits(String str) {
    String retStr="";
    for(int i=0; i<str.length(); i+=2){
	retStr= retStr+str.charAt(i);
     
    }
    return retStr;
}

//10 min


public String frontTimes(String str, int n) {
    String retStr="";
    if (str.length()<=3){
	while(n>0){
	    retStr= retStr+str;
	    n = n - 1;
	}
    }else{
	String ph=str.substring(0,3);
	while(n>0){
	    retStr= retStr+ph;
	    n = n - 1;
	}}
    return retStr;
}

//15 min

public String stringYak(String str) {
    int iter=0;
    int len=str.length();
    String fin=str;
    while (iter<len-2){
	if (fin.substring(iter, iter+3).equals("yak")){
	    fin= fin.substring(0,iter)+fin.substring(iter+3);
	    len=fin.length();
	}
	iter = iter + 1;
    }
    return fin;
}
// 25 min
