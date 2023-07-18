package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import navigation.Controller;

public class TablesScreen extends Pane {
	private Label pageTitle;
	private TableView table = new TableView();
	private static final double FONT_SIZE = 20;

	public TablesScreen() {
		this.initialize();
	}

	private void initialize() {
		this.pageTitle = new Label();
		this.pageTitle.setText("Tables Screen");
		Font font = new Font(TablesScreen.FONT_SIZE);
		this.pageTitle.setFont(font);

		this.pageTitle.setLayoutX(225);
		this.pageTitle.setLayoutY(15);
		this.getChildren().add(pageTitle);

		Button goBack = new Button();
		goBack.setText("Go Back");
		goBack.setLayoutX(500);
		goBack.setLayoutY(500);

		goBack.setOnAction(event -> {
			Controller.getInstance().goBack();

		});

		table.setEditable(true);
		table.setScaleX(1.4);
		TableColumn firstCol = new TableColumn("Book Name");
		TableColumn secondCol = new TableColumn("Genre");
		TableColumn thirdCol = new TableColumn("Publisher");

		table.getColumns().addAll(firstCol, secondCol, thirdCol);
		table.setLayoutX(170);
		table.setLayoutY(60);
		this.getChildren().add(goBack);
		this.getChildren().add(table);

	}
}
