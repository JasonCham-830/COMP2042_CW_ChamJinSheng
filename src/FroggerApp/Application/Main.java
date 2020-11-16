package FroggerApp.Application;

import FroggerApp.Actor.Animal;
import FroggerApp.Game_Scene.gameScene_Controller;
import FroggerApp.Game_Scene.gameScene_Model;
import FroggerApp.Menu_Scene.menuScene_View;
import javafx.application.Application;
import javafx.stage.Stage;

import FroggerApp.Game_Scene.gameScene_View;

public class Main extends Application{


	public static void main(String[] args) {
		launch(args);
	}


	public void start(Stage primaryStage) throws Exception {

//		gameScene_View view = new gameScene_View();
//		gameScene_Model model = new gameScene_Model(primaryStage);
//		gameScene_Controller controller= new gameScene_Controller(model,view);
//
//		controller.runGameScene();
		menuScene_View m = new menuScene_View(primaryStage);
		m.menuStart();
		//model.start();
	}
}



