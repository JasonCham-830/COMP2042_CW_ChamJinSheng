package FroggerApp.Game_Scene;

import FroggerApp.Actor.Animal;
import javafx.scene.Scene;

/**
 * Game Scene Controller
 */
public class gameScene_Controller {
    private gameSceneEasy_View view;
    private gameSceneHard_View view2;
    private gameScene_Model model;
    Animal animal = new Animal();

    /**
     * Game Scene Controller constructor for easy mode
     * @param model - gameScene_Model
     * @param view - gameScene_View
     */
    public gameScene_Controller(gameScene_Model model, gameSceneEasy_View view){
        this.model = model;
        this.view = view;
    }

    /**
     * Game Scene Controller constructor for hard mode
     * @param model - gameScene_Model
     * @param view2 - gameScene_View
     */
    public gameScene_Controller(gameScene_Model model, gameSceneHard_View view2) {
        this.model = model;
        this.view2 = view2;
    }

    /**
     * Method to get current Scene from model
     * @return getScene in model
     */
    public Scene getScene(){
        return model.getScene();
    }

    /**
     * Method to set Scene from model
     * @param scene - set current scene in model
     */
    public void setScene(Scene scene){
        model.setScene(scene);
    }

    /**
     * Method to run Easy mode game scene by passing parameters to gameSceneEasy_View and call gameScene_Model to start the application
     * @throws Exception
     */
    public void runGameSceneEasy() throws Exception {
        view.gameStart(model.getPrimaryStage(),model.getBackground(),model.getAnimal(),model.getScene());
        animal.setSpeed(-2.0,0.75,-1.0,-1.0);
        model.start();
    }

    /**
     * Method to run Hard mode same scene by passing parameters to gameSceneHard_View and call gameScene_Model to start the application
     * @throws Exception
     */
    public void runGameSceneHard() throws Exception {
        view2.gameStart(model.getPrimaryStage(),model.getBackground(),model.getAnimal(),model.getScene());
        animal.setSpeed(-2.0,2.0,-2.0,1.0);
        model.start();
    }
}
