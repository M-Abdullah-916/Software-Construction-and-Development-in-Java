import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		String noOfWords;
		String[] splittion;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input Words (Seprated by Commas) : ");
		noOfWords = scanner.next();
		
		splittion = noOfWords.split(",");
		ArrayList<Integer> words = new ArrayList<Integer>(splittion.length);
		
		for (String num : splittion)
		{
			words.add(Integer.parseInt(num));
		}
		System.out.print("List of Interger is : " +words);
	}

}
