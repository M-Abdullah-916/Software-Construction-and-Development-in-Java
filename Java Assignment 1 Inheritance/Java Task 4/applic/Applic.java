package applic;

import javafx.application.Application;
import javafx.stage.Stage;
import navigation.Controller;

public class Applic extends Application {
	private Controller controller;

	@Override
	public void start(Stage Window) throws Exception {
		this.controller = Controller.getInstance();
		Window.setTitle("Main Screen");
		this.controller.setStage(Window);
		this.controller.startApplication();
	}

	public static void main(String[] args) {
		launch();
	}
}
