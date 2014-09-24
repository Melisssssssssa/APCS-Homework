// Lab
public class StringStuff{
//Diff21 WORKING
public int diff21(int n) {
  if (n<21){
     return 21-n;
  }
  return 2*(n-21);
}

//nearHundred WORKING
public boolean nearHundred(int n) {
  return Math.abs(100-n)<=10 || Math.abs(200-n)<=10;
}

//mixstart WORKING
 public boolean mixStart(String str) {
	return str.startsWith("ix", 1);
    }

//teaParty Working
public int teaParty(int tea, int candy) {
  if (tea < 5 || candy < 5) return 0;
  if (tea >= 2*candy || candy >= 2*tea) return 2;
  return 1;
}


//lastDigit WORKING

public boolean lastDigit(int a, int b, int c) {
   return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
 
}

}
