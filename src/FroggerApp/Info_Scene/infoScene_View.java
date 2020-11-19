package FroggerApp.Info_Scene;

import FroggerApp.Actor.*;
import FroggerApp.Game_Scene.gameScene_Controller;
import FroggerApp.Game_Scene.gameScene_Model;
import FroggerApp.Game_Scene.gameScene_View;
import FroggerApp.World.MyStage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class infoScene_View {

    public infoScene_View(){}

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
