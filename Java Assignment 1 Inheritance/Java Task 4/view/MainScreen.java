package view;

import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import navigation.Controller;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainScreen extends Pane {
	private Label pageTitle;
	private static final double FONT_SIZE = 20;

	public MainScreen() {
		this.initialize();
	}

	private void initialize() {
		this.pageTitle = new Label();
		this.pageTitle.setText("BOOKS");
		this.pageTitle.setLayoutX(235);
		this.pageTitle.setLayoutY(15);
		Font font = new Font(MainScreen.FONT_SIZE);
		this.pageTitle.setFont(font);
		this.getChildren().add(pageTitle);

		Button search = new Button();
		Button viewBooks = new Button();
		TextField textField = new TextField();

		search.setText("Search");
		viewBooks.setText("View Books");
		textField.setPromptText("Search Word");

		search.setLayoutX(200);
		search.setLayoutY(250);

		viewBooks.setLayoutX(270);
		viewBooks.setLayoutY(250);

		textField.setLayoutX(200);
		textField.setLayoutY(210);

		search.setOnAction(event -> {
			textField.setText("Search Not Supported");
		});

		viewBooks.setOnAction(event -> {
			Controller.getInstance().navigateTo(ViewsProvider.TABLE_SCREEN);

		});
		this.getChildren().add(viewBooks);
		this.getChildren().add(search);
		this.getChildren().add(textField);

	}
}
