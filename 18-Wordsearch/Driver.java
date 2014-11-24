import java.util.Scanner;
import java.io.File;

public class Driver{
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	Scanner sc = null;
	try {
	    sc =new Scanner(new File("words.txt"));
	}	catch (Exception e) {
	    System.out.println("File not found");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    String s = sc.next();
	    w.addWord(s);	
	}
	System.out.println(w);
	System.out.println("Have fun \n");
	w.fillBoard();
	System.out.print(w);
    }
}
