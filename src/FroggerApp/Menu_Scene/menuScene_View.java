package FroggerApp.Menu_Scene;

import FroggerApp.Actor.BackgroundImage;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class menuScene_View extends Parent {

    public menuScene_View(){
    }

    public void menuStart(Stage menuStage, Group group, Scene scene, Button startButton, Button infoButton ) throws Exception{


        menuStage.setTitle("Frogger Arcade Application");

        //Background Image

        group.getChildren().add(new BackgroundImage("file:src/FroggerApp/Images_File/BackgroundImage.jpg"));

        //Title text
        Text titleText = new Text("Welcome to Frogger Arcade Game!");
        group.getChildren().add(titleText);
        titleText.setLayoutX(205);
        titleText.setLayoutY(200);

        //start button
        group.getChildren().add(startButton);
        startButton.setLayoutX(265);
        startButton.setLayoutY(500);

        //info button

        group.getChildren().add(infoButton);
        infoButton.setLayoutX(265);
        infoButton.setLayoutY(570);


        // set the scene
        menuStage.setScene(scene);
        menuStage.show();


    }


}
