import java.util.Scanner;

public class Problem3 {

	static void stringManipulationTask(int choice) {
		Scanner scanner = new Scanner(System.in);
		if (choice == 1) {
			String string1 = new String();
			int place;
			System.out.print("Enter your String : ");
			string1 = scanner.nextLine();
			System.out.print("Enter your Place to choose character : ");
			place = scanner.nextInt();
			place -= 1;
			System.out.print("Character at desired place is : " + string1.charAt(place));
			;
		} else if (choice == 2) {
			String string1 = new String();
			String string2 = new String();
			System.out.print("Enter your String 1 : ");
			string1 = scanner.nextLine();
			System.out.print("Enter your String 2 : ");
			string2 = scanner.nextLine();
			;
			System.out.print("Equality is : " + string1.equals(string2));

		} else if (choice == 3) {
			String string1 = new String();
			int place1, place2;
			System.out.print("Enter your String : ");
			string1 = scanner.nextLine();
			System.out.print("Enter your Starting Place for Sub-String : ");
			place1 = scanner.nextInt();
			System.out.print("Enter your Ending Place for Sub-String : ");
			place2 = scanner.nextInt();
			System.out.print("Sub-String is : " + string1.subSequence(place1, place2));

		} else
			System.out.println("INVALID ENTRY");

	}

	public static void main(String[] args) {
		int opt;
		System.out.println("Press 1 for charAt function ");
		System.out.println("Press 2 for equals function ");
		System.out.println("Press 3 for subSequence function ");
		System.out.print("Enter Your Choice : ");
		Scanner scanner = new Scanner(System.in);
		opt = scanner.nextInt();
		stringManipulationTask(opt);
	}

}
