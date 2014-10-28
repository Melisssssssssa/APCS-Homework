public class Arrays {

    public int[] frontPiece(int[] nums) {
	int[] intArray;
	if (nums.length >= 2){
	    intArray = new int[2];
	    for (int i = 0; i < 2; i++){
	        intArray[i] = nums[i];
	    }
	}
	else{
	    intArray = new int[nums.length];
	    for (int i = 0; i < nums.length; i++){
	        intArray[i] = nums[i];
	    }
	}
	return intArray;
    }

    public int sum13(int[] nums) {
	if (nums.length == 0){
	    return 0;
	}
        else{
	    int total = 0;
	    int i = 0;
	    while (i < nums.length){
		if (nums[i] == 13){
		    i += 2;
		}
		else{
		    total = total + nums[i];
		    i += 1;
		}
	    }
	    return total;
	}
    }
}
