package lab6_f190916;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Book {

	private String Title;
	private String Publisher;
	private String Genre;
	
	
	Book(String title, String publisher, String genre) {
		this.Title = title;
		this.Publisher = publisher;
		this.Genre =  genre;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public ObservableList<Book> getBooks() {
		final ObservableList<Book> bookList = FXCollections.observableArrayList(
			    new Book("Arabian Nights", "Jhonny Smith", "Novel"),
			    new Book("Baburnama", "Babur", "History"),
			    new Book("Mein Kampf", "Adolf Hitler", "Biography"),
			    new Book("Time Machine", "H.G. WELLS", "Fiction"),
			    new Book("Gulliver’s Travels", "JONATHAN SWIFT", "Fantasy")
			);
		return bookList;

	}

}
