import javax.swing.JOptionPane;

public class Project0 {
	public static void main(String[] args) {
		while(true) {
			String sentence = JOptionPane.showInputDialog("Enter a sentence");//let user enter a sentence
			int Ecount = 0, ecount = 0;						//counting how many e user enter
			if(sentence.equals("STOP")) {
				System.exit(0);								//check for if the user want to stop this program
			}
			for(int i = 0; i< sentence.length(); i++) {		//loop though the array of string and check for the big E and small e
				if(sentence.charAt(i) == 'E') Ecount++;		//if at sentence of index i find a E it increase 1 and vice versa
				else if(sentence.charAt(i) == 'e') ecount++;
			}
			//tell user how many E e they have enter
			JOptionPane.showMessageDialog(null, "In this sentence uppercase E has " + Ecount + " and lowercase e has " + ecount);
		}
	}
}