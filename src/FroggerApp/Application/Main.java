package FroggerApp.Application;

import FroggerApp.Menu_Scene.MenuScene_View;
import javafx.application.Application;
import javafx.stage.Stage;
import FroggerApp.Game_Scene.GameScene_View;

public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		GameScene_View gameScene_View= new GameScene_View(primaryStage);
		gameScene_View.gameStart();
	}
}



