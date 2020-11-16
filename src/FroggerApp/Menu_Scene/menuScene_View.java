package FroggerApp.Menu_Scene;

import FroggerApp.Actor.BackgroundImage;
import FroggerApp.Game_Scene.gameScene_Controller;
import FroggerApp.Game_Scene.gameScene_Model;
import FroggerApp.Game_Scene.gameScene_View;
import FroggerApp.Info_Scene.infoScene_View;
import FroggerApp.World.MyStage;

import com.sun.prism.PhongMaterial;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import FroggerApp.SceneManager.sceneManager;

public class menuScene_View extends Parent {

    //private static MyStage background;
    private Stage menuStage;

    public menuScene_View(Stage menuStage){
        this.menuStage = menuStage;
    }

    public void menuStart() throws Exception{


        menuStage.setTitle("Frogger Arcade Application");
        Group group = new Group();

        //Background Image
        BackgroundImage menuBackground = new BackgroundImage("file:src/FroggerApp/Images_File/BackgroundImage.jpg");
        group.getChildren().add(menuBackground);

        //Title text
        Text titleText = new Text("Welcome to Frogger Arcade Game!");
        group.getChildren().add(titleText);
        titleText.setLayoutX(205);
        titleText.setLayoutY(200);

        //start button
        Button startButton = new Button("Start game");
        group.getChildren().add(startButton);
        startButton.setLayoutX(265);
        startButton.setLayoutY(500);
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                gameScene_View view = new gameScene_View();
		        gameScene_Model model = new gameScene_Model(menuStage);
        		gameScene_Controller controller= new gameScene_Controller(model,view);
                try {
                    controller.runGameScene();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
//      startButton.setOnAction(e->menuStage.setScene(GameScene_Controller.setScene()));
//        startButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                new sceneManager();
//            }
//        });

        //info button
        Button infoButton = new Button("Info");
        group.getChildren().add(infoButton);
        infoButton.setLayoutX(285);
        infoButton.setLayoutY(570);
        infoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                infoScene_View view = new infoScene_View(menuStage);
                try {
                    view.infoStart();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // set the scene
        Scene scene = new Scene(group,600,800);
        menuStage.setScene(scene);
        menuStage.show();
        //menuMyStage.playMusic();

    }

//    public static MyStage getBackground(){
//        return background;
//    }
//
//    public void setBackground(MyStage background){
//        this.background = background;
//    }

//    public void startButtonListener(){
//        MenuScene_View.getStartButton().set
//    }
//
//    public MenuScene_View getView(){
//        return this.view;
//    }
//
//    public void setView(MenuScene_View view){
//        this.view = view;
//    }
//
//    public MenuScene_Model getModel(){
//        return this.model;
//    }
//
//    public void MenuScene_Model(MenuScene_Model model){
//        this.model = model;
//    }

}
