package FroggerApp.Application;

import FroggerApp.Menu_Scene.menuScene_Controller;
import FroggerApp.Menu_Scene.menuScene_Model;
import FroggerApp.Menu_Scene.menuScene_View;
import FroggerApp.Scene_Manager.sceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

	/**
	 * Main application
	 * @param args launch the arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 *Start method to start the application
	 * @param primaryStage Stage for application
	 * @throws Exception
	 */
	public void start(Stage primaryStage) throws Exception {
		sceneManager sm = new sceneManager(primaryStage);
		sm.toMenuScene();
	}
}



