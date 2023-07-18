package App.java;

import java.net.URL;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;

public class App extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {

		Pane pane = new Pane();
		Scene scene;
		
		try {
			URL r = getClass().getResource("Form.fxml");
			if (r == null)
				throw new Exception("No FXML resource found.");
			scene = new Scene(FXMLLoader.load(r));
			stage.setScene(scene);
			stage.setTitle("SCENE BUILDER");
			stage.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
