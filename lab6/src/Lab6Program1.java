import javax.swing.*;

public class Lab6Program1 {

	public static void main(String[] args) {
	
		//String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
		int[] wordArray = new int[14];
		String inputFileName = args[0];
		inputFromFile(inputFileName, wordArray);
		String isOrIsNot;
					
		System.out.println("sum: "sum)
		System.out.println("average: ")
		
		// This line asks the user for input by popping out a single window
		// with text input
		while(true) {
		String inputWord = JOptionPane.showInputDialog(null, "Enter a integer:");
		if(inputWord.equals("STOP")) System.exit(0);
		// if the inputWord is contained within wordArray return true
		if (wordIsThere(inputWord, wordArray)) 
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
	} //main
	}
	public static boolean wordIsThere(String findMe, int[] wordArray) {
		for(int i=0;i< wordArray.length;i++) {
			if(Integer.parseInt(findMe) == wordArray[i]){
					return true;
			}
		
	}
		return false;
		// wordIsThere
}
	private static int inputFromFile(String filename, int[] wordArray){
		TextFileInput in = new TextFileInput(filename);
		int lengthFilled = 0;
		String line = in.readLine();
		while ( lengthFilled < wordArray.length && line != null ) {
			//wordArray[lengthFilled++] = Short.parseShort(line);
			wordArray[lengthFilled++] = Integer.parseInt(line);
			line = in.readLine();
		} // while
		if ( line != null ) {
		System.out.println("File contains too many numbers.");
		System.out.println("This program can process only " +
		wordArray.length + " numbers.");
		System.exit(1);
		} // if
		in.close();
		return lengthFilled;
		} // method inputFromFile
}// class Lab4Program1

	public static int sum (int[] myArray, int myArraysize) {
		int sum = 0;
		for(int i = 0;i<myArraysize; i++) {
			sum += myAyyaysize[i];
		}
	}
