package FroggerApp.Menu_Scene;

import FroggerApp.Actor.BackgroundImage;
import FroggerApp.World.MyStage;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class MenuScene_View extends Parent {

    private Stage menuStage;

    public MenuScene_View(Stage menuStage){
        this.menuStage = menuStage;
    }

    public void menuStart() throws Exception{

        MyStage menuMyStage = new MyStage();
        menuStage.setTitle("Main Menu");
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

        //info button
        Button infoButton = new Button("Info");
        group.getChildren().add(infoButton);
        infoButton.setLayoutX(285);
        infoButton.setLayoutY(570);

        // set the scene
        Scene scene = new Scene(group,600,800);
        menuStage.setScene(scene);
        menuStage.show();
        //menuMyStage.playMusic();

    }

}
