package FroggerApp.Info_Scene;

import FroggerApp.Actor.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * InfoScene_View class
 */
public class infoScene_View {

    /**
     * Empty constructor
     */
    public infoScene_View(){}

    /**
     * InfoStart method to set up the info stage
     * @param infoStage Stage for info scene
     * @param root Root for info scene
     * @param scene Scene for info scene
     * @param startButton StartButton in info scene
     * @throws Exception
     */
    public void infoStart(Stage infoStage,Group root, Scene scene,Button startButton) throws Exception{

        scene.getStylesheets().add("file:src/FroggerApp/Menu_Scene/stylesheet.css");
        root.getChildren().add(new BackgroundImage("file:src/FroggerApp/Images_File/infoPage.png"));

        root.getChildren().add(startButton);
        startButton.setLayoutX(330);
        startButton.setLayoutY(680);
        BackgroundImage startImg = new BackgroundImage("file:src/FroggerApp/Images_File/startButton.png");
        startImg.setFitHeight(50);
        startImg.setFitWidth(200);
        startButton.setGraphic(startImg);
        infoStage.setScene(scene);
        infoStage.show();

    }
}
