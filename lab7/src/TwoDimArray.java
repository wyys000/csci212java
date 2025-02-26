
public class TwoDimArray {

	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		printArray(myArray);
		System.out.print("\n");
		printArrayEven(myArray);
		System.out.println();
		String filename = args[0];
		int[][] newArray = fillArray(filename);
		printArray(newArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		System.out.print(num+" ");
	}
	private static void printArrayEven(int[][] theArray){
		for(int i = 0; i< theArray.length;i++) {
			for(int j = 0; j<theArray[i].length;j++) {
				if(theArray[i][j] %2 != 0) {
					System.out.print("* ");
				} else {
					display(theArray[i][j]);
				}
			}
			System.out.println();
		}
	}
	public static int[][] fillArray(String myFile){
		TextFileInput in = new TextFileInput(myFile);
		String row = in.readLine();
		int r = Integer.parseInt(row);
		String col = in.readLine();
		int c = Integer.parseInt(col);
		int[][] numberArray = new int [r][c];
		for(int i = 0; i < r;i++) {
			for(int j = 0; j< c; j++) {
				String temp = in.readLine();
				numberArray[i][j] = Integer.parseInt(temp);
				
			}
		}
		return numberArray;
		
	}

}
