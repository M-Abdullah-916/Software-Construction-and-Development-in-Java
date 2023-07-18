package lab6_f190916;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class Screen extends Pane{
	Label pageTitle = new Label();
	TableView tableview = new TableView();
	TableColumn<Book, String> Title = new TableColumn();
	TableColumn<Book, String> Publisher = new TableColumn();
	TableColumn<Book, String> Genre = new TableColumn();
	
	
	public Screen(Book book){
		
		pageTitle.setText("Book Screen");
		pageTitle.setFont(new Font("Arial", 40));
		tableview.setEditable(true);
		Title.setText("Title");
		Publisher.setText("Publisher");
		Genre.setText("Genre");

		Title.setCellValueFactory(new PropertyValueFactory<Book, String>("Title"));
		Publisher.setCellValueFactory(new PropertyValueFactory<Book, String>("Publisher"));
		Genre.setCellValueFactory(new PropertyValueFactory<Book, String>("Genre"));
		
		
		Title.setPrefWidth(90);
		Publisher.setPrefWidth(90);
		Genre.setPrefWidth(90);
		
		
		tableview.autosize();
		tableview.setMaxHeight(370);
		tableview.setMaxWidth(470);
		tableview.setLayoutX(130);
		tableview.setLayoutY(80);
		tableview.setScaleX(1.5);

		
		tableview.setItems(book.getBooks());
		tableview.getColumns().addAll(Title, Publisher, Genre);

		this.getChildren().addAll(tableview,pageTitle);
		
		
	}
	
	
}
