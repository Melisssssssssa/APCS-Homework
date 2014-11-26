import java.util.Random;

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
    
    public boolean checkIndex(String w, int row, int col, int upOrDown, int rightOrLeft){
	boolean Ok = true;
	int len = w.length() - 1;
	if (upOrDown == 1 && Ok) Ok = (row + len < board.length);
	if (upOrDown == 0 && Ok) Ok = (row < board.length);
	if (upOrDown == -1 && Ok) Ok = (row - len > 0);
	if (rightOrLeft == 1 && Ok) Ok = (col + len < board[0].length);
	if (rightOrLeft == 0 && Ok) Ok = (col < board[0].length);
	if (rightOrLeft == -1 && Ok) Ok = (col - len > 0);
	Ok = (row > -1 && col > -1 && row < board.length && col < board[0].length && Ok);
	return Ok;
    }
    
    public boolean checkOver(String w, int row, int col, int upOrDown, int rightOrLeft){
	boolean OK = true;
	for (int a = 0; a < w.length(); a++){
	    if (board[row + (upOrDown * a)][col + (rightOrLeft * a)] != w.charAt(a) && board[row + (upOrDown * a)][col + (rightOrLeft * a)] != '.') {
		OK = false;
		break;
	    }
	}
	return OK;
    }
    
    public boolean addWordA(String w, int row, int col, int upOrDown, int rightOrLeft){
	if (checkIndex(w, row, col, upOrDown, rightOrLeft)){
	    if (checkOver(w, row, col, upOrDown, rightOrLeft)){
		int c = col;
		int r = row;
		for (int loc = 0; loc < w.length(); loc++){    
		    board[r][c] = w.charAt(loc);
		    r += upOrDown;
		    c += rightOrLeft;
		}
	    }
	    return true;
	} 
	return false;
    }
		
    public boolean addWord(String w){
	Random r = new Random();
	boolean in = false;
	for (int tries = 0; tries < 100; tries++){
	    int row = r.nextInt(board.length);
	    int col = r.nextInt(board[0].length);
	    int upOrDown = r.nextInt(3) - 1;
	    int rightOrLeft = r.nextInt(3) - 1;
	    while (upOrDown == 0 && rightOrLeft == 0){
		upOrDown = r.nextInt(3) - 1;
		rightOrLeft = r.nextInt(3) - 1;
	    }
	    if (addWordA(w, row, col, upOrDown, rightOrLeft)){
		in = true;
		break;
	    }
	}
	return in;
    }
    
    public void fillBoard(){
	String alphabet = "qwertyuiopasdfghjklzxcvbnm";
	Random location = new Random();
	for (int b = 0; b < board.length; b++){
	    for (int d = 0; d < board[b].length; d++){
		if (board[b][d] == '.'){
		    board[b][d] = alphabet.charAt(location.nextInt(26));
		}
	    }
	}
    }
}
