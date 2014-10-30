import java.util.*;

public class ArrayStuff {

   
    private int[] a;
    Random r;

    
    public ArrayStuff(int n){
	r = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75+r.nextInt(76);
	}
    }

    public ArrayStuff(){
	this(100);
    }

   
    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;
    }

    public int find(int n){
	for (int i = 0; i < a.length; i++){
	    if (a[i] == n){
		return i;
	    }
	}
	return -1;
    }
    
    public int maxVal(){
        int greatest = 0;
	for (int i = 0; i < a.length; i++){
	    if (a[i] > greatest){
		greatest = a[i];
	    }
	}
	return greatest;
    }

    //------------- Classwork / HW 14b --------------
    public int freq(int i){
	int count = 0;
	int num = a[i];
	for (int k = 0; k < a.length; k++){
	    if (num == a[k]){
		count += 1;
	    }
	}
	return count;
    }

    public int sum67(int[] nums) {
	boolean skip = false;
	int total = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] == 6 && !skip){
	        skip = true;
	    }
	    else if (nums[i] == 7 && skip){
		skip = false;
	    }
	    else if (!skip){
		total += nums[i];
	    }
	}
	return total;
    }

    public boolean more14(int[] nums) {
	int TotalOnes = 0;
	int TotalFours = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] == 1){
		TotalOnes += 1;
	    }
	    else if (nums[i] == 4){
		TotalFours += 1;
	    }
	}
	return TotalOnes > TotalFours;
    }

    public int[] tenRun(int[] nums) {
	int[] fin = new int[nums.length];
	int multiple = -1;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] % 10 == 0 && nums[i] != multiple){
		multiple = nums[i];
		fin[i] = nums[i];
	    }
	    else if (multiple != -1){
		fin[i] = multiple;
	    }
	    else{
		fin[i] = nums[i];
	    }
	}
	return fin;
    }

    public boolean tripleUp(int[] nums) {
	if (nums.length < 3){
	    return false;
	}
	int current = nums[0];
	int PatternCount = 1;
	for (int i = 0; i < nums.length && PatternCount != 3; i++){
	    if (nums[i] == current + 1){
		PatternCount += 1;
	    }
	    else{
		PatternCount = 1;
	    }
	    current = nums[i];
	}
	if (PatternCount == 3){
	    return true;
	}
	return false;
    }

    public boolean canBalance(int[] nums) {
	boolean Balance = false;
	int total = 0;
	int upToHalf = 0;
	if (nums.length == 1){
	    return false;
	}
      	for (int i = 0; i < nums.length; i++){
	    total += nums[i];
	}
	if (total % 2 == 0){
	    for (int i = 0; i < nums.length && upToHalf < total/2; i++){
		upToHalf += nums[i];
	    }
	}
	if (upToHalf == total/2){
	    return true;
	}
	return false;	
    }

    public int[] seriesUp(int n) {
	int[] fin = new int[n*(n + 1)/2];
	int loc = 0;
	for (int groupCount = 1; groupCount <= n; groupCount++){
	    for (int i = 1; i <= groupCount; i++){
		fin[loc] = i;
		loc += 1;
	    }
	}
	return fin;
    }


    public static void main(String[] args) {
	ArrayStuff s = new ArrayStuff(10);
	System.out.println(s);
	System.out.println(s.find(150));
	System.out.println(s.find(114));
	System.out.println(s.maxVal());
	System.out.println(s.freq(1));
	System.out.println(s.freq(0));
    }
}
