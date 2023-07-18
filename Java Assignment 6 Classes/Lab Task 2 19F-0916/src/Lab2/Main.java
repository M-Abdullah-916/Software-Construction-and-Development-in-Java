package Lab2;

import java.util.Scanner;

public class Main {

	Scanner scanner = new Scanner(System.in);

	private Book createABookFromUserInput() {
		Book book = new Book();

		System.out.println("Enter the Title of Book : ");
		String mainTitle = scanner.nextLine();
		book.setTitle(mainTitle);

		System.out.println("Enter the Price of Book : ");
		float mainPrice = scanner.nextFloat();
		book.setPrice(mainPrice);

		System.out.println("Enter the Page Count of Book : ");
		int mainPageCount = scanner.nextInt();
		book.setPageCount(mainPageCount);

		return book;
	}

	private Tape createATapeFromUserInput() {
		Tape tape = new Tape();
		scanner.nextLine();
		System.out.println("Enter the Title of Tape : ");
		String mainTitle = scanner.nextLine();
		tape.setTitle(mainTitle);

		System.out.println("Enter the Price of Tape : ");
		float mainPrice = scanner.nextFloat();
		tape.setPrice(mainPrice);

		System.out.println("Enter the No. of Minutes of Book : ");
		int mainMinutes = scanner.nextInt();
		tape.setTimeInMinutes(mainMinutes);

		return tape;
	}

	public static void main(String[] args) {

		Main main = new Main();
		Publications book = main.createABookFromUserInput();
		Publications tape = main.createATapeFromUserInput();

		book.displayDetails();
		tape.displayDetails();

	}
}
