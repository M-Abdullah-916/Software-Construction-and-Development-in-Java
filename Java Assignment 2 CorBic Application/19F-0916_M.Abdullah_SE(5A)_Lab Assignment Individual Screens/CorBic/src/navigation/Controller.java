package navigation;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.ViewsProvider;

import java.util.Stack;

public class Controller {
	private Stage Window;
	private final Stack<Parent> flowHistory;
	private Scene mainScene;
	private final ViewsProvider viewsProvider;
	private static final String NO_VIEW_ERROR = "No Such View Exists";
	private static final Controller self = new Controller();

	public static Controller getInstance() {
		return self;
	}

	private Controller() {
		this.flowHistory = new Stack<>();
		this.viewsProvider = new ViewsProvider();
	}

	public void navigateTo(String viewName) {
		Parent view = this.viewsProvider.getView(viewName);
		if (view == null) {
			throw new RuntimeException(Controller.NO_VIEW_ERROR);
		}
		this.flowHistory.add(view);
		this.mainScene.setRoot(view);
	}

	public void goBack() {
		if (!this.flowHistory.empty()) {

			this.flowHistory.pop();
			this.mainScene.setRoot(this.flowHistory.peek());
		}
	}

	public void startApplication() {
		if (this.Window == null) {
			throw new RuntimeException("No Window Set");
		}

		Parent root = this.viewsProvider.getView(ViewsProvider.SPLASH_SCREEN);

		if (root == null) {
			throw new RuntimeException(Controller.NO_VIEW_ERROR);
		}

		this.flowHistory.add(root);
		this.mainScene = new Scene(root, 900, 600);
		this.Window.setScene(this.mainScene);
		this.Window.show();
	}

	public void setStage(Stage stage) {
		this.Window = stage;
	}
}
