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
    private Stage infoStage;

    public infoScene_View(Stage infoStage){
        this.infoStage = infoStage;
    }

    public void infoStart() throws Exception{


        Group root = new Group();

        BackgroundImage infoBackground = new BackgroundImage("file:src/FroggerApp/Images_File/infoPage.png");
        root.getChildren().add(infoBackground);

        Button startButton = new Button("Start game");
        startButton.setLayoutX(500);
        startButton.setLayoutY(700);
        root.getChildren().add(startButton);
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                gameScene_View view = new gameScene_View();
                gameScene_Model model = new gameScene_Model(infoStage);
                gameScene_Controller controller= new gameScene_Controller(model,view);
                try {
                    controller.runGameScene();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Scene scene = new Scene(root,600,800, Color.BLACK);
        infoStage.setScene(scene);
        infoStage.show();

    }
}
