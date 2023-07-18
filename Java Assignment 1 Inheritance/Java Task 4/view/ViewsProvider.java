package view;

import java.util.HashMap;

import javafx.scene.Parent;

public class ViewsProvider {
	private HashMap<String, Parent> views;

	public static final String MAIN_SCREEN = "MAIN";
	public static final String TABLE_SCREEN = "TABLE";

	public ViewsProvider() {
		this.views = new HashMap<>();
		this.views.put(ViewsProvider.MAIN_SCREEN, new MainScreen());
		this.views.put(ViewsProvider.TABLE_SCREEN, new TablesScreen());
	}

	public Parent getView(String viewName) {
		return this.views.getOrDefault(viewName, null);
	}
}
