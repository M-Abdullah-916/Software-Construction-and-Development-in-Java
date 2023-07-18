package lab6_f190916;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch();

	}

	public void start(Stage stage) throws Exception {
		Book book = new Book(null, null, null);
		Screen screen = new Screen(book);
		
		Scene scene = new Scene(screen,600,600);
		stage.setScene(scene);
		stage.show();

	}

}
