public class WordSearch{

    private char[][] board;

    public WordSearch (int r, int c){

	board = new char[r][c];
	for ( int i = 0; i < board.length; i++){
	    for (int j =0;j< board[i].length; j++){
		board [i][j]=".";
	    }
	}
	
    }

    public WordSearch{
	this(30,20);
    }

    

    public String toString(){
	String s = " ";
	for (int i =0;i< board.length; i++){
	    for (int j=0; j< board[i].length;j++){
		s =s +board[i][j];
	    }
	    s= s + "\n";
	}
	return s;
    }

    public boolean canAdd(String w, int row, int col) {
	int r = row, c = col;
	boolean b;
	for (int i=0; i<w.length(); i++) {
	    if (board[r][c] !== ".") {
		b = true;
	    }
	}
	return b;
    }
  public void addWordH(String w, int row, int col) {
	int r = row, c = col;
	for (int i=0; i<w.length();i++) {
	    if (canAdd(w, r, c)) {
		board[r][c] = w.charAt(i);
		c++;
	    }
	    if(c>board[r].length) {
		break;
	    }
	}
    }

    public void addWordHback(String w, int row, int col) {
	int r = row, c = col;

	for(int i=s.length()-1;i>=0;i--) {
	    if (canAdd(w, r, c)) {
		board[r][c] = s.charAt(i);
		c++;
	    }
	    if(c<0) { 
		break; 
	    }
	}
    }
    
    public void addWordV(String w, int row, int col) {
	int r = row, c = col;
	for (int i=0; i<w.length();i++) {
	    board[c][r] = w.charAt(i);
	    c++;
	}
    }
    
    public void addWordSE(String w, int row, int col) {
	int r = row, c = col;
	for (int i=0; i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    c++;
	    r++;
	}
    }

    public void addWordNE(String w, int row, int col) {
	int r = row, c = col;
	for (int i=0; i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    c++;
	    r--;
	}
    }

    public void addWordNW(String w, int row, int col) {
	int r = row, c = col;
	for (int i=0; i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    c--;
	    r--;
	}
    }

    public void addWordSW(String w, int row, int col) {
	int r = row, c = col;
	for (int i=0; i<w.length();i++) {
	    board[r][c] = w.charAt(i);
	    c--;
	    r++;
	}
    }

    public static void main(String[] args){
	WordSearch w = new WordSearch();
	System.out.println(w);
	w.addWordH("hello",3,5);
	w.addWordV("look",4,8);
	w.addWordSE("nihao",6,9);
	w.addWordNE("konichiwa",11,13);
	w.addWordNW("ciao",17,15);
	w.addWordSW("hola",14,8);
	System.out.println(w);


    }
}

	
}
