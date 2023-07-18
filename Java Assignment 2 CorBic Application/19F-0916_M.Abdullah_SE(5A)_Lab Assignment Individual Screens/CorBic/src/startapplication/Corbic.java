package startapplication;

import javafx.application.Application;
import javafx.stage.Stage;
import navigation.Controller;

public class Corbic extends Application {
	private Controller controller;

	@Override
	public void start(Stage Window) throws Exception {
		this.controller = Controller.getInstance();
		Window.setTitle("CORBIC by JZA");
		this.controller.setStage(Window);
		this.controller.startApplication();
	}

	public static void main(String[] args) {
		launch();
	}
}
