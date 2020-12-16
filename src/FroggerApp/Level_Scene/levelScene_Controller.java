package FroggerApp.Level_Scene;

import javafx.scene.Scene;

/**
 * LevelScene Controller class
 */
public class levelScene_Controller {
    private levelScene_View view;
    private levelScene_Model model;

    /**
     * levelScene_Controller constructor to call its view and model
     * @param view menuScene_View
     * @param model menuScene_Model
     */
    public levelScene_Controller(levelScene_View view,levelScene_Model model){
        this.view = view;
        this.model = model;
    }

    /**
     * getScene method to getScene
     * @return getScene from model
     */
    public Scene getScene(){
        return model.getScene();
    }

    /**
     * setScene method to set current scene
     * @param scene Set current menu scene
     */
    public void setScene(Scene scene){
        model.setScene(scene);
    }

    /**
     * Run runMenuScene by parsing parameters to view and invokes model's level1Button and level2Button method
     * @throws Exception
     */
    public void runLevelScene() throws Exception {
        view.levelStart(model.getMenuStage(),model.getRoot(),model.getScene(),model.getLevel1Button(),model.getLevel2Button());
        model.setLevel1Button(model.getLevel1Button());
        model.setLevel2Button(model.getLevel2Button());

    }
}
