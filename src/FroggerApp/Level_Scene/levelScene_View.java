package FroggerApp.Level_Scene;

import FroggerApp.Actor.BackgroundImage;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

/**
 * LevelScene View class
 */
public class levelScene_View extends Parent {

    /**
     * Empty constructor
     */
    public levelScene_View(){
    }

    /**
     * InfoStart method to set up the info stage
     * @param menuStage Stage for menu scene
     * @param group Group for menu scene
     * @param scene Scene for menu scene
     * @param level1Button EasyButton for menu scene
     * @param level2Button HardButton for menu scene
     * @throws Exception
     */
    public void levelStart(Stage menuStage, Group group, Scene scene, Button level1Button, Button level2Button ) throws Exception{

        //Background Image

        group.getChildren().add(new BackgroundImage("file:src/FroggerApp/Images_File/mainMenu.png"));
        scene.getStylesheets().add("file:src/FroggerApp/Menu_Scene/stylesheet.css");

        //start button
        group.getChildren().add(level1Button);
        level1Button.setLayoutX(195);
        level1Button.setLayoutY(450);
        BackgroundImage startImg = new BackgroundImage("file:src/FroggerApp/Images_File/easy.png");
        startImg.setFitHeight(50);
        startImg.setFitWidth(200);
        level1Button.setGraphic(startImg);
        //group.getStylesheets().add("src/Menu_Scene/stylesheet.css");
        //info button

        group.getChildren().add(level2Button);
        level2Button.setLayoutX(188);
        level2Button.setLayoutY(520);
        BackgroundImage infoImg = new BackgroundImage("file:src/FroggerApp/Images_File/hard.png");
        infoImg.setFitHeight(50);
        infoImg.setFitWidth(200);
        level2Button.setGraphic(infoImg);

        // set the scene
        menuStage.setScene(scene);
        menuStage.show();

    }
}
