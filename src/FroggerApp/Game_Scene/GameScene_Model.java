package FroggerApp.Game_Scene;

import FroggerApp.Actor.Animal;
import FroggerApp.Actor.Digit;
import FroggerApp.World.MyStage;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class GameScene_Model {

    private Stage primaryStage;
    private AnimationTimer timer;
    private MyStage background;
    private Animal animal;
    private Scene scene;

    public GameScene_Model(Stage primaryStage){
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
                    System.out.print("STOP:");
                    background.stopMusic();
                    stop();
                    background.stop();
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("You Have Won The Game!");
                    alert.setHeaderText("Your High Score: " + animal.getPoints() + "!");
                    alert.setContentText("Highest Possible Score: 800");
                    alert.show();
                }
            }
        };
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

    public void setBackground(MyStage background){
        this.background = background;
    }

    public Animal getAnimal(){
        return animal;
    }

    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    public Stage getPrimaryStage(){
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage){
        this.primaryStage = primaryStage;
    }

    public AnimationTimer getTimer(){
        return timer;
    }

    public void setTimer(AnimationTimer timer){
        this.timer = timer;
    }

    public Scene getScene(){
        return scene;
    }

    public void setScene(Scene scene){
        this.scene = scene;
    }
}
