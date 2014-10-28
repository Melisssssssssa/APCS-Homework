public class Driver{
    public static void main(String[] args){
	Arrays x = new Arrays();

	int[] y = new int[] {1,2,3};
	int[] z = new int[] {1,2,13};

	System.out.println("~~~FrontPiece Tests~~~");
	System.out.println("\nexpecting {1,2}");

	int[] intArray = new int[2];
	intArray = x.frontPiece(y);
	for(int i=0;i<intArray.length;i++){
	    System.out.print(intArray[i]+" ");
	}

	System.out.println("\n\n~~~sum13 Tests~~~");
	System.out.println("\nexpecting 6");
	System.out.println(x.sum13(y));
	System.out.println("\nexpecting 3");
	System.out.println(x.sum13(z));
    }
}
