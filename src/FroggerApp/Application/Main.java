package FroggerApp.Application;

import FroggerApp.Menu_Scene.menuScene_Controller;
import FroggerApp.Menu_Scene.menuScene_Model;
import FroggerApp.Menu_Scene.menuScene_View;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{


	public static void main(String[] args) {
		launch(args);
	}


	public void start(Stage primaryStage) throws Exception {

		menuScene_View view = new menuScene_View();
		menuScene_Model model = new menuScene_Model(primaryStage);
		menuScene_Controller controller = new menuScene_Controller(view, model);
		controller.runMenuScene();

	}
}



