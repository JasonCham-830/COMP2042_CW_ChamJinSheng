package FroggerApp.Game_Scene;

import FroggerApp.Actor.Animal;
import FroggerApp.Actor.Digit;
import FroggerApp.World.MyStage;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class GameScene_Model {

    private Stage primaryStage;
    private AnimationTimer timer;
    private MyStage background;
    private Animal animal;

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
                    System.out.print("STOPP:");
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
}
