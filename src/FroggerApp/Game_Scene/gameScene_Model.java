package FroggerApp.Game_Scene;

import FroggerApp.Actor.Animal;
import FroggerApp.Actor.Digit;
import FroggerApp.Score_File.scoreFile;
import FroggerApp.Menu_Scene.menuScene_Controller;
import FroggerApp.Menu_Scene.menuScene_Model;
import FroggerApp.Menu_Scene.menuScene_View;
import FroggerApp.World.MyStage;

import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.ArrayList;

public class gameScene_Model {

    private Stage primaryStage;
    private AnimationTimer timer;
    private MyStage background;
    private Animal animal;
    private static Scene scene;

    public gameScene_Model(Stage primaryStage){
        this.primaryStage = primaryStage;
        background = new MyStage();
        this.scene  = new Scene(background,600,800);
        animal = new Animal("file:src/FroggerApp/Images_File/froggerUp.png");
    };

    public void start() {
        background.playMusic();
        createTimer();
        timer.start();
    }

    public void stop() {
        timer.stop();
    }

    public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (animal.changeScore()) {
                    setNumber(animal.getPoints());
                }
                if (animal.getStop()) {
                    System.out.print("Game Ended");
                    background.stopMusic();
                    stop();
                    background.stop();
                    //

                    ArrayList list = scoreFile.sortFile(animal.getPoints());
                    popUp(list);
                }
            }
        };
    }

    public void popUp(ArrayList<Integer> list){


        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        alert.setTitle("You Have Won The Game!");
        alert.setHeaderText("Your High Score: " + animal.getPoints() + "!");
        alert.setContentText(Integer.toString(list.get(0)));

        String highScoreContent = String.format("Highscore\n1. " + list.get(0) + "\n2. " + list.get(1) + "\n3. " + list.get(2) + "\n4. " + list.get(3) + "\n5. " + list.get(4));
        alert.setContentText(highScoreContent);

        ButtonType backToMainMenu = new ButtonType("Back to Main Menu");
        ButtonType quit = new ButtonType("Quit Game");
        alert.getButtonTypes().setAll(backToMainMenu,quit);

        alert.setOnCloseRequest(e -> {
            ButtonType result = alert.getResult();
            if(result!= null && result == quit){
                primaryStage.close();
            } else {
                menuScene_View view = new menuScene_View();
                menuScene_Model model = new menuScene_Model(primaryStage);
                menuScene_Controller controller = new menuScene_Controller(view, model);
                try {
                    controller.runMenuScene();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        alert.show();
    }

    public void setNumber(int n) {
        int shift = 0;
        while (n > 0) {
            int d = n / 10;
            int k = n - d * 10;
            n = d;
            background.add(new Digit(k, 30, 360 - shift, 25));
            shift+=30;
        }
    }

    public MyStage getBackground(){
        return background;
    }

    public Animal getAnimal(){
        return animal;
    }

    public Stage getPrimaryStage(){
        return primaryStage;
    }

    public static Scene getScene(){
        return scene;
    }

    public void setScene(Scene scene){
        this.scene = scene;
    }
}
