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

/**
 * Game scene model
 */
public class gameScene_Model {

    private Stage primaryStage;
    private AnimationTimer timer;
    private MyStage background;
    private Animal animal;
    private static Scene scene;

    /**
     * Game Scene model constructor
     * @param primaryStage Stage passed by menu scene
     */
    public gameScene_Model(Stage primaryStage){
        this.primaryStage = primaryStage;
        background = new MyStage();
        this.scene  = new Scene(background,600,800);
        animal = new Animal("file:src/FroggerApp/Images_File/froggerUp.png");
    };

    /**
     * Method to start the animation, music and timer
     */
    public void start() {
        background.playMusic();
        createTimer();
        timer.start();
    }

    /**
     * Method to stop the timer
     */
    public void stop() {
        timer.stop();
    }

    /**
     * Method used to change score in scoreboard and stop game when 5 frogs are in the coves
     */
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

                    ArrayList list = scoreFile.sortFile(animal.getPoints());
                    popUp(list);
                }
            }
        };
    }

    /**
     * Method for pop up screen when player win the game
     * @param list A list of score from scoreFile to display at the pop up
     */
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

    /**
     * Method used to set number in the scoreboard
     * @param n - current point in the game
     */
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

    /**
     * Method to getBackground
     * @return background(MyStage)
     */
    public MyStage getBackground(){
        return background;
    }

    /**
     * Method to getAnimal
     * @return animal(Animal)
     */
    public Animal getAnimal(){
        return animal;
    }

    /**
     * Method to getPrimaryStage
     * @return primaryStage(Stage)
     */
    public Stage getPrimaryStage(){
        return primaryStage;
    }

    /**
     * Method to return getScene
     * @return scene(Scene)
     */
    public static Scene getScene(){
        return scene;
    }

    /**
     * Method to set current scene
     * @param scene - Current scene
     */
    public void setScene(Scene scene){
        this.scene = scene;
    }
}
