package FroggerApp.Menu_Scene;

import javafx.scene.Scene;

/**
 * MenuScene Controller class
 */
public class menuScene_Controller {
    private menuScene_View view;
    private menuScene_Model model;

    /**
     * MenuScene_Controller constructor to call its view and model
     * @param view menuScene_View
     * @param model menuScene_Model
     */
    public menuScene_Controller(menuScene_View view,menuScene_Model model){
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
     * Run runMenuScene by parsing parameters to view and invokes model's setStartButton and setInfoButton method
     * @throws Exception
     */
    public void runMenuScene() throws Exception {
        view.menuStart(model.getMenuStage(),model.getRoot(),model.getScene(),model.getStartButton(),model.getInfoButton());
        model.setStartButton(model.getStartButton());
        model.setInfoButton(model.getInfoButton());
    }
}
