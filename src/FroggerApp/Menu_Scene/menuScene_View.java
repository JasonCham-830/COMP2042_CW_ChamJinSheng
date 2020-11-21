package FroggerApp.Menu_Scene;

import FroggerApp.Actor.BackgroundImage;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

/**
 * MenuScene View class
 */
public class menuScene_View extends Parent {

    /**
     * Empty constructor
     */
    public menuScene_View(){
    }

    /**
     * InfoStart method to set up the info stage
     * @param menuStage Stage for menu scene
     * @param group Group for menu scene
     * @param scene Scene for menu scene
     * @param startButton StartButton for menu scene
     * @param infoButton InfoButton for menu scene
     * @throws Exception
     */
    public void menuStart(Stage menuStage, Group group, Scene scene, Button startButton, Button infoButton ) throws Exception{

        menuStage.setTitle("Frogger Arcade Application");

        //Background Image

        group.getChildren().add(new BackgroundImage("file:src/FroggerApp/Images_File/mainMenu.png"));
        scene.getStylesheets().add("file:src/FroggerApp/Menu_Scene/stylesheet.css");

        //start button
        group.getChildren().add(startButton);
        startButton.setLayoutX(195);
        startButton.setLayoutY(450);
        BackgroundImage startImg = new BackgroundImage("file:src/FroggerApp/Images_File/startButton.png");
        startImg.setFitHeight(50);
        startImg.setFitWidth(200);
        startButton.setGraphic(startImg);
        //group.getStylesheets().add("src/Menu_Scene/stylesheet.css");
        //info button

        group.getChildren().add(infoButton);
        infoButton.setLayoutX(188);
        infoButton.setLayoutY(520);
        BackgroundImage infoImg = new BackgroundImage("file:src/FroggerApp/Images_File/infoButton.png");
        infoImg.setFitHeight(50);
        infoImg.setFitWidth(200);
        infoButton.setGraphic(infoImg);



        // set the scene
        menuStage.setScene(scene);
        menuStage.show();


    }


}
