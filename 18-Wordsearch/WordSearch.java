public class WordSearch {
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    public WordSearch() {
	this(20,40);
    }
 
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public boolean checkIndex(int i, int RorC){
	boolean OK = false;
	if (RorC == 0){
	    if (i < board.length && i > 0)
		OK = true;
	} else if (RorC == 1){
	    if (i < board[0].length && i > 0)
		OK = true;
	}
	if (!OK) System.out.println("Index out of Range. addWord canceled.");
	return OK;
    }
    
    public boolean checkOverH(int row, int col, String w){
	boolean OK = true;
	
	for (int a = 0; a < w.length(); a++){
	    if (board[row][a + col] != w.charAt(a) && board[row][a + col] != '.') {
		OK = false;
		break;
	    }
	}
	
	if (!OK) System.out.println("Word already there & not overlapping. addWord canceled.");
	return OK;
    }
    
    public boolean checkOverV(int row, int col, String w){
	boolean OK = true;
	for (int a = 0; a < w.length(); a++){
	    if (board[row + a][col] != w.charAt(a) && board[row + a][col] != '.'){
		OK = false;
		break;
	    }
	}
	if (!OK) System.out.println("Word already there & not overlapping. addWord canceled.");
	return OK;
    }
    
    // direc is either 1 or -1 (forwards or backwards)
    
    public String reverseString(String s){
	String t = "";
	for (int j = 0; j < s.length(); j++){
	    t = s.charAt(j) + t;
	}
	return t;
    }
    
    public void addWordH(String w, int row, int col,int direc){
	if (direc == -1) w = reverseString(w);
	if (checkIndex(col + w.length() - 1,1) && checkIndex(row,0)){
	    if (checkOverH(row,col,w)){
		int c = col;
		for (int loc = 0; loc < w.length(); loc++){
		    board[row][c] = w.charAt(loc);
		    c++;
		}
	    }
	}
    }
    
    public void addWordV(String w, int row, int col, int direc){
	if (direc == -1) w = reverseString(w);
	if (checkIndex(col, 1) && checkIndex(row + w.length() - 1,0)){
	    if (checkOverV(row,col,w)){
		int r = row;
		for (int loc = 0; loc < w.length(); loc++){
		    board[r][col] = w.charAt(loc);
		    r++;
		}
	    }
	}
    }
    public static void main(String[] args) {
	WordSearch w = new WordSearch(10,40);
	//System.out.println(w);
	w.addWordH("look",3,14,1); // test illegal overlap
	w.addWordH("look",3,17,1); // test legal overlap
	w.addWordH("look",-3,20,1); // test illegal row
	w.addWordH("look",3,55,1); // test illegal col
	w.addWordH("olleh",4,14,-1);
       	w.addWordH("hello",4,18,-1);
	w.addWordH("olleh",4,22,-1);
	w.addWordH("dogs",6,3,1);
	w.addWordV("hello",2,4,1);
	w.addWordV("spmal",4,24,-1);
	System.out.print(w);
    }

}
