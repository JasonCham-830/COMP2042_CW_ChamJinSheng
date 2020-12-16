package FroggerApp.Game_Scene;

import FroggerApp.Actor.*;
import FroggerApp.World.MyStage;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Game Scene Hard View
 */
public class gameSceneHard_View {

    /**
     * Empty constructor
     */
    public gameSceneHard_View() {}

    /**
     * Display background, images and start the application
     * @param primaryStage Stage for game scene
     * @param background Background scene for images, music
     * @param animal Use to declare frog character
     * @param scene Scene for stage
     * @throws Exception
     */

    public void gameStart(Stage primaryStage, MyStage background, Animal animal,Scene scene) throws Exception {

        background.add(new BackgroundImage("file:src/FroggerApp/Images_File/backgroundHard.jpg"));

        background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 100, 166, -2));
        background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 300, 166, -2));
        background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 500, 166, -2));

        //1st
        background.add(new WetTurtle(500, 217, -2, 130, 130));
        background.add(new WetTurtle(300, 217, -2, 130, 130));
        background.add(new WetTurtle(100, 217, -2, 130, 130));

        //2nd
        background.add(new WetTurtle(200, 329, 1, 130, 130));
        background.add(new WetTurtle(400, 329, 1, 130, 130));
        background.add(new WetTurtle(599, 329, 1, 130, 130));

        background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 50, 276, 2));
        background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 280, 276, 2));
        background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 510, 276, 2));

        background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 0, 376, 2));
        background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 220, 376, 2));
        background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 440, 376, 2));



        background.add(new End(13,96));
        background.add(new End(141,96));
        background.add(new End(141 + 141-13,96));
        background.add(new End(141 + 141-13+141-13+1,96));
        background.add(new End(141 + 141-13+141-13+141-13+3,96));

        background.add(animal);

        background.add(new Obstacle("file:src/FroggerApp/Images_File/car1Left.png", 100, 649, -3, 50, 50));
        background.add(new Obstacle("file:src/FroggerApp/Images_File/car1Left.png", 310, 649, -3, 50, 50));
        background.add(new Obstacle("file:src/FroggerApp/Images_File/car1Left.png", 520, 649, -3, 50, 50));

        background.add(new Obstacle("file:src/FroggerApp/Images_File/car1right.png", 100, 597, 1, 50, 50));
        background.add(new Obstacle("file:src/FroggerApp/Images_File/car1right.png", 350, 597, 1, 50, 50));
        background.add(new Obstacle("file:src/FroggerApp/Images_File/car1right.png", 599, 597, 1, 50, 50));

        background.add(new Obstacle("file:src/FroggerApp/Images_File/truck2Left.png", 200, 540, -2, 200, 200));
        background.add(new Obstacle("file:src/FroggerApp/Images_File/truck2Left.png", 500, 540, -2, 200, 200));

        background.add(new Obstacle("file:src/FroggerApp/Images_File/car1right.png", 500, 490, 3, 50, 50));
        background.add(new Obstacle("file:src/FroggerApp/Images_File/car1right.png", 200, 490, 3, 50, 50));
        background.add(new Digit(0, 30, 360, 25));

        background.start();

        primaryStage.setScene(scene);
        primaryStage.show();

        //start();
    }


}
