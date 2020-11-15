package FroggerApp.Application;

import FroggerApp.Actor.Animal;
import FroggerApp.Game_Scene.GameScene_Controller;
import FroggerApp.Game_Scene.GameScene_Model;
import FroggerApp.Menu_Scene.MenuScene_View;
import FroggerApp.World.MyStage;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.control.Menu;
import javafx.stage.Stage;
import FroggerApp.Game_Scene.GameScene_View;

public class Main extends Application{

	private Stage primaryStage;
	private AnimationTimer timer;
	private MyStage background;
	private Animal animal;

	public static void main(String[] args) {
		launch(args);
	}


	public void start(Stage primaryStage) throws Exception {

		GameScene_View view = new GameScene_View();
		GameScene_Model model = new GameScene_Model(primaryStage);
		GameScene_Controller controller= new GameScene_Controller(model,view);

		controller.runGameScene();
//		MenuScene_View m = new MenuScene_View(primaryStage);
//		m.menuStart();
		//model.start();
	}
}



