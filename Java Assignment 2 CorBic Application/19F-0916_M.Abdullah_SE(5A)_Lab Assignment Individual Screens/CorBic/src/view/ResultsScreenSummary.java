package view;

import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import navigation.Controller;

public class ResultsScreenSummary extends Pane {

	private static final double FONT_SIZE = 45;

	private Label pageTitleLbl;
	private Label wordLbl = new Label();
	private Label searchStringLbl = new Label();
	private Label databaseLbl = new Label();
	private Label searchTimeLbl = new Label();
	private Label totalOccuranceLbl = new Label();

	private Button fileBtn = new Button();
	private final ComboBox<String> gotoBtn = new ComboBox<String>();
	private Button infoBtn = new Button();
	private Button summaryBtn = new Button();
	private Button citationsBtn = new Button();
	private Button searchBtn = new Button();

	private Alert dialogBox = new Alert(AlertType.INFORMATION);

	private TextField searchedRootField = new TextField();

	private Rectangle rectangleShape = new Rectangle();
	private Ellipse ellipseShape = new Ellipse();
	{
		ellipseShape.setCenterX(130.0f);
		ellipseShape.setCenterY(58.0f);
		ellipseShape.setRadiusX(250.0f);
		ellipseShape.setRadiusY(50.0f);
	}

	public ResultsScreenSummary() {
		this.initialize();
	}

	private void initialize() {

		ResultsScreenSummaryShapes();
		ResultsScreenSummaryLabels();
		ResultsScreenSummaryButtons();
		ResultsScreenSummaryTextFields();
	}

	private void ResultsScreenSummaryButtons() {

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

		citationsBtn.setOnAction(event -> {
			searchedRootField.setText(null);
			searchedRootField.setPromptText("Searched root");
			Controller.getInstance().navigateTo(ViewsProvider.RESULT_SCREEN_CITATIONS);

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

	private void ResultsScreenSummaryLabels() {

		pageTitleLbl = new Label();
		pageTitleLbl.setText("RESULTS");
		pageTitleLbl.setScaleX(1.5);
		pageTitleLbl.setLayoutX(400);
		pageTitleLbl.setLayoutY(20);
		Font font = new Font(ResultsScreenSummary.FONT_SIZE);
		pageTitleLbl.setFont(font);

		wordLbl.setText("Word");
		searchStringLbl.setText("Search String");
		databaseLbl.setText(" Database");
		searchTimeLbl.setText(" Search Time");
		totalOccuranceLbl.setText(" Total number of occurrences");

		wordLbl.setLayoutX(250);
		searchStringLbl.setLayoutX(260);
		databaseLbl.setLayoutX(250);
		searchTimeLbl.setLayoutX(255);
		totalOccuranceLbl.setLayoutX(275);

		wordLbl.setLayoutY(250);
		searchStringLbl.setLayoutY(280);
		databaseLbl.setLayoutY(310);
		searchTimeLbl.setLayoutY(340);
		totalOccuranceLbl.setLayoutY(370);

		wordLbl.setScaleX(1.5);
		searchStringLbl.setScaleX(1.5);
		databaseLbl.setScaleX(1.5);
		searchTimeLbl.setScaleX(1.5);
		totalOccuranceLbl.setScaleX(1.5);

		wordLbl.setScaleY(1.5);
		searchStringLbl.setScaleY(1.5);
		databaseLbl.setScaleY(1.5);
		searchTimeLbl.setScaleY(1.5);
		totalOccuranceLbl.setScaleY(1.5);

		this.getChildren().addAll(pageTitleLbl, wordLbl, searchStringLbl, databaseLbl, searchTimeLbl,
				totalOccuranceLbl);
	}

	private void ResultsScreenSummaryShapes() {
		ellipseShape.setFill(Color.LIGHTGREY);
		ellipseShape.setLayoutX(370);

		rectangleShape.setWidth(640);
		rectangleShape.setHeight(370);
		rectangleShape.setFill(Color.LIGHTBLUE);
		rectangleShape.setLayoutX(230);
		rectangleShape.setLayoutY(200);

		this.getChildren().addAll(ellipseShape, rectangleShape);
	}

	private void ResultsScreenSummaryTextFields() {
		searchedRootField.setPromptText("Searched root");
		searchedRootField.setLayoutX(520);
		searchedRootField.setLayoutY(130);
		searchedRootField.setScaleX(2);
		searchedRootField.setScaleY(1.5);

		this.getChildren().add(searchedRootField);
	}
}
