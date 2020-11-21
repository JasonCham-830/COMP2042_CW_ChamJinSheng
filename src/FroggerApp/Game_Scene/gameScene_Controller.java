package FroggerApp.Game_Scene;

import javafx.scene.Scene;

/**
 * Game Scene Controller
 */
public class gameScene_Controller {
    private gameScene_View view;
    private gameScene_Model model;

    /**
     * Game Scene Controller constructor
     * @param model - gameScene_Model
     * @param view - gameScene_View
     */
    public gameScene_Controller(gameScene_Model model, gameScene_View view){
        this.model = model;
        this.view = view;
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
     * Method to run Game Scene by passing parameters to gameScene_View and call gameScene_Model to start the application
     * @throws Exception
     */
    public void runGameScene() throws Exception {
        view.gameStart(model.getPrimaryStage(),model.getBackground(),model.getAnimal(),model.getScene());
        model.start();
    }
}
