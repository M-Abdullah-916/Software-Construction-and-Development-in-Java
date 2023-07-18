package view;

import java.util.HashMap;
import javafx.scene.Parent;

public class ViewsProvider {
	private HashMap<String, Parent> views;

	public static final String SPLASH_SCREEN = "SPLASH";
	public static final String RESULT_SCREEN_SUMMARY = "RESULTS_SUMMARY";
	public static final String RESULT_SCREEN_CITATIONS = "RESULTS_CITATIONS";

	public ViewsProvider() {
		this.views = new HashMap<>();
		this.views.put(ViewsProvider.SPLASH_SCREEN, new SplashScreen());
		this.views.put(ViewsProvider.RESULT_SCREEN_SUMMARY, new ResultsScreenSummary());
		this.views.put(ViewsProvider.RESULT_SCREEN_CITATIONS, new ResultsScreenCitations());
	}

	public Parent getView(String viewName) {
		return this.views.getOrDefault(viewName, null);
	}
}
