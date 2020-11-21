package FroggerApp.Game_Scene;

import FroggerApp.Actor.*;
import FroggerApp.World.MyStage;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Game Scene View
 */
public class gameScene_View {

        /**
         * Empty constructor
         */
    public gameScene_View() {}

        /**
         * Display background, images and start the application
         * @param primaryStage Stage for game scene
         * @param background Background scene for images, music
         * @param animal Use to declare frog character
         * @param scene Scene for stage
         * @throws Exception
         */

    public void gameStart(Stage primaryStage, MyStage background, Animal animal,Scene scene) throws Exception {

            background.add(new BackgroundImage("file:src/FroggerApp/Images_File/BackgroundImage.jpg"));

            background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 0, 166, 0.75));
            background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 220, 166, 0.75));
            background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 440, 166, 0.75));

            background.add(new Log("file:src/FroggerApp/Images_File/logs.png", 300, 0, 276, -2));
            background.add(new Log("file:src/FroggerApp/Images_File/logs.png", 300, 400, 276, -2));

            background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 50, 329, 0.75));
            background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 270, 329, 0.75));
            background.add(new Log("file:src/FroggerApp/Images_File/log3.png", 150, 490, 329, 0.75));

            background.add(new Turtle(500, 376, -1, 130, 130));
            background.add(new Turtle(300, 376, -1, 130, 130));

            background.add(new WetTurtle(700, 376, -1, 130, 130));
            background.add(new WetTurtle(600, 217, -1, 130, 130));
            background.add(new WetTurtle(400, 217, -1, 130, 130));
            background.add(new WetTurtle(200, 217, -1, 130, 130));

            background.add(new End(13,96));
            background.add(new End(141,96));
            background.add(new End(141 + 141-13,96));
            background.add(new End(141 + 141-13+141-13+1,96));
            background.add(new End(141 + 141-13+141-13+141-13+3,96));

            background.add(animal);

            background.add(new Obstacle("file:src/FroggerApp/Images_File/truck1"+"Right.png", 0, 649, 1, 120, 120));
            background.add(new Obstacle("file:src/FroggerApp/Images_File/truck1"+"Right.png", 300, 649, 1, 120, 120));
            background.add(new Obstacle("file:src/FroggerApp/Images_File/truck1"+"Right.png", 600, 649, 1, 120, 120));
            //background.add(new Obstacle("file:src/FroggerApp/Images_File/truck1"+"Right.png", 720, 649, 1, 120, 120));
            background.add(new Obstacle("file:src/FroggerApp/Images_File/car1Left.png", 100, 597, -1, 50, 50));
            background.add(new Obstacle("file:src/FroggerApp/Images_File/car1Left.png", 250, 597, -1, 50, 50));
            background.add(new Obstacle("file:src/FroggerApp/Images_File/car1Left.png", 400, 597, -1, 50, 50));
            background.add(new Obstacle("file:src/FroggerApp/Images_File/car1Left.png", 550, 597, -1, 50, 50));
            background.add(new Obstacle("file:src/FroggerApp/Images_File/truck2Right.png", 0, 540, 1, 200, 200));
            background.add(new Obstacle("file:src/FroggerApp/Images_File/truck2Right.png", 500, 540, 1, 200, 200));

            background.add(new Obstacle("file:src/FroggerApp/Images_File/car1Left.png", 500, 490, -5, 50, 50));
            background.add(new Digit(0, 30, 360, 25));

            background.start();

            primaryStage.setScene(scene);
            primaryStage.show();

            //start();
            }


}
