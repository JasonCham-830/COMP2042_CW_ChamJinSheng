package FroggerApp.Menu_Scene;

import FroggerApp.Actor.Animal;
import FroggerApp.Actor.BackgroundImage;
import FroggerApp.World.MyStage;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MenuScene_View extends Parent {

    private Stage menuStage;

    public MenuScene_View(Stage menuStage){
        this.menuStage = menuStage;
    }

    public void menuStart() throws Exception{
        /*Scene scene = new Scene(background,600,800);

        menuStage.setTitle("Main menu");
        menuStage.setScene(scene);
        menuStage.show();;

         */
        menuStage.setTitle("Main Menu");
        Group group = new Group();



        Scene scene = new Scene(group,600,800);
        scene.setFill(Color.BROWN);

        BackgroundImage menuBackground = new BackgroundImage("file:src/FroggerApp/Images_File/BackgroundImage.jpg");
        group.getChildren().add(menuBackground);

        // set the scene
        menuStage.setScene(scene);

        menuStage.show();


    }

}
