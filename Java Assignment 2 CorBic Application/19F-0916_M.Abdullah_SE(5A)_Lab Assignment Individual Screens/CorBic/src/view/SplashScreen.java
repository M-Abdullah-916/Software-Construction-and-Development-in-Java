package view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import navigation.Controller;

public class SplashScreen extends Pane {
	private Label pageTitle;
	private Label pageHeading;
	private ProgressBar loadingBar = new ProgressBar(0);
	private Button proceedBtn = new Button();
	private Image defaultLogo = new Image("C:\\Users\\Ibm\\Desktop\\_IoT---Relational-Database.png");
	ImageView logoProvider = new ImageView();

	public SplashScreen() {
		this.initialize();
	}

	private void initialize() {

		SplashScreenLabels();
		SpashScreenLoadingBar();
		SplashScreenButtons();

	}

	private void SplashScreenLabels() {

		pageTitle = new Label();
		pageTitle.setText("ARABIC CORPUS");
		pageTitle.setLayoutX(290);
		pageTitle.setLayoutY(15);
		Font fontTitle = new Font(40);
		pageTitle.setFont(fontTitle);

		pageHeading = new Label();
		pageHeading.setText("by JZA FAST");
		pageHeading.setLayoutX(370);
		pageHeading.setLayoutY(70);
		Font fontHeading = new Font(25);
		pageHeading.setFont(fontHeading);

		logoProvider.setFitWidth(300);
		logoProvider.setLayoutX(285);
		logoProvider.setLayoutY(130);
		logoProvider.setPreserveRatio(true);
		logoProvider.setSmooth(true);
		logoProvider.setCache(true);
		logoProvider.setImage(defaultLogo);

		this.getChildren().addAll(pageTitle, pageHeading, logoProvider);
	}

	private void SplashScreenButtons() {

		proceedBtn.setText("PROCEED");
		proceedBtn.setLayoutX(700);
		proceedBtn.setLayoutY(500);

		proceedBtn.setOnAction(event -> {
			Controller.getInstance().navigateTo(ViewsProvider.RESULT_SCREEN_SUMMARY);

		});
		this.getChildren().add(proceedBtn);
	}

	private void SpashScreenLoadingBar() {

		loadingBar.setLayoutX(400);
		loadingBar.setLayoutY(300);
		loadingBar.setPadding(new Insets(150, 0.1, 200, 0.1));
		loadingBar.setScaleX(5.5);
		loadingBar.setScaleY(2.7);
		loadingBar.setProgress(100);
		this.getChildren().add(loadingBar);
	}
}
