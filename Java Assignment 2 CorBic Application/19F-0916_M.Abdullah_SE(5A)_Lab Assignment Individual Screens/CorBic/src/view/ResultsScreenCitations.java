package view;

import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import navigation.Controller;

public class ResultsScreenCitations extends Pane {

	private TableView<Object> citationTable = new TableView<Object>();
	private TableColumn citationSortCol = new TableColumn("Sort");
	private TableColumn citationWordCol = new TableColumn("Word");
	private TableColumn citationAfterCol = new TableColumn("After 10 Words");
	private TableColumn citationSourceCol = new TableColumn("Source");
	private Label pageTitle;

	private static final double FONT_SIZE = 45;

	private Button fileBtn = new Button();
	private final ComboBox<String> gotoBtn = new ComboBox<String>();
	private Button infoBtn = new Button();
	private Button summaryBtn = new Button();
	private Button citationsBtn = new Button();
	private Button searchBtn = new Button();

	private Alert dialogBox = new Alert(AlertType.INFORMATION);

	private TextField searchedRootField = new TextField();

	private Ellipse ellipseShape = new Ellipse();
	{
		ellipseShape.setCenterX(130.0f);
		ellipseShape.setCenterY(58.0f);
		ellipseShape.setRadiusX(250.0f);
		ellipseShape.setRadiusY(50.0f);
	}

	public ResultsScreenCitations() {
		this.initialize();
	}

	private void initialize() {

		ResultsScreenCitationsShapes();
		ResultsScreenCitationsLabels();
		ResultsScreenCitationsTable();
		ResultsScreenCitationsButtons();
		ResultsScreenCitationsTextFields();

	}

	private void ResultsScreenCitationsLabels() {

		pageTitle = new Label();
		pageTitle.setText("RESULTS");
		pageTitle.setScaleX(1.5);
		pageTitle.setLayoutX(400);
		pageTitle.setLayoutY(20);
		Font font = new Font(ResultsScreenCitations.FONT_SIZE);
		pageTitle.setFont(font);

		this.getChildren().add(pageTitle);
	}

	@SuppressWarnings("unchecked")
	private void ResultsScreenCitationsTable() {

		citationTable.setEditable(true);

		citationAfterCol.setPrefWidth(150);
		citationSortCol.setPrefWidth(90);
		citationSourceCol.setPrefWidth(90);
		citationWordCol.setPrefWidth(90);

		citationTable.autosize();
		citationTable.setMaxHeight(370);
		citationTable.setLayoutX(340);
		citationTable.setLayoutY(200);
		citationTable.setScaleX(1.5);

		citationTable.getColumns().addAll(citationSortCol, citationWordCol, citationAfterCol, citationSourceCol);

		this.getChildren().add(citationTable);
	}

	private void ResultsScreenCitationsButtons() {

		fileBtn.setText("File");
		fileBtn.setPadding(new Insets(5, 15, 5, 10));
		fileBtn.setScaleX(2.5);
		fileBtn.setScaleY(1.8);
		fileBtn.setLayoutX(50);
		fileBtn.setLayoutY(130);

		gotoBtn.setPromptText("Goto");
		gotoBtn.setPadding(new Insets(5, 20, 5, 30));
		gotoBtn.setScaleX(1);
		gotoBtn.setScaleY(1.4);
		gotoBtn.setLayoutX(138);
		gotoBtn.setLayoutY(127);
		gotoBtn.setEditable(false);

		gotoBtn.getItems().addAll("Search", "Result", "Import", "Setting");

		infoBtn.setText("Info.");
		infoBtn.setPadding(new Insets(5, 15, 5, 10));
		infoBtn.setScaleX(2.5);
		infoBtn.setScaleY(1.8);
		infoBtn.setLayoutX(320);
		infoBtn.setLayoutY(130);

		summaryBtn.setText("Summary");
		summaryBtn.setPadding(new Insets(5, 15, 5, 10));
		summaryBtn.setScaleX(2.5);
		summaryBtn.setScaleY(1.8);
		summaryBtn.setLayoutX(80);
		summaryBtn.setLayoutY(280);

		citationsBtn.setText("Citations");
		citationsBtn.setPadding(new Insets(5, 15, 5, 10));
		citationsBtn.setScaleX(2.5);
		citationsBtn.setScaleY(1.8);
		citationsBtn.setLayoutX(80);
		citationsBtn.setLayoutY(337);

		searchBtn.setText("Search");
		searchBtn.setPadding(new Insets(5, 9, 5, 10));
		searchBtn.setScaleX(2.5);
		searchBtn.setScaleY(1.8);
		searchBtn.setLayoutX(790);
		searchBtn.setLayoutY(130);

		dialogBox.setResizable(true);

		searchBtn.setOnAction(event -> {
			searchedRootField.setText("Search Not Supported");
		});

		summaryBtn.setOnAction(event -> {
			searchedRootField.setText(null);
			searchedRootField.setPromptText("Searched root");
			Controller.getInstance().navigateTo(ViewsProvider.RESULT_SCREEN_SUMMARY);

		});

		fileBtn.setOnAction(event -> {
			dialogBox.setTitle("Functionality Message");
			dialogBox.setContentText("File Button Is Not Accessible At the Moment.");
			dialogBox.show();

		});

		infoBtn.setOnAction(event -> {
			dialogBox.setTitle("Screen Information");
			dialogBox.setContentText("This Screen Shows the Results by taking following in considerations:"
					+ "\n .Sorted Results on Words.\n .Search Results on Words.\n .Words After Searched Word."
					+ "\n .Sources of Searched Words");

			dialogBox.show();

		});

		gotoBtn.setOnAction(event -> {
			String value = (String) gotoBtn.getValue();
			if (value == "Result") {
				dialogBox.setContentText("Already on Results Screen!");
				dialogBox.show();

			} else if (value == "Search") {
				dialogBox.setContentText("Needs to be Linked by other Members!");
				dialogBox.show();

			} else if (value == "Import") {
				dialogBox.setContentText("Needs to be Linked by other Members!");
				dialogBox.show();

			} else if (value == "Setting") {
				dialogBox.setContentText("Needs to be Linked by other Members!");
				dialogBox.show();

			} else
				System.out.print("");

		});

		this.getChildren().addAll(fileBtn, gotoBtn, infoBtn, summaryBtn, citationsBtn, searchBtn);
	}

	private void ResultsScreenCitationsShapes() {
		ellipseShape.setFill(Color.LIGHTGREY);
		ellipseShape.setLayoutX(370);

		this.getChildren().add(ellipseShape);
	}

	private void ResultsScreenCitationsTextFields() {
		searchedRootField.setPromptText("Searched root");
		searchedRootField.setLayoutX(520);
		searchedRootField.setLayoutY(130);
		searchedRootField.setScaleX(2);
		searchedRootField.setScaleY(1.5);

		this.getChildren().add(searchedRootField);
	}

}
