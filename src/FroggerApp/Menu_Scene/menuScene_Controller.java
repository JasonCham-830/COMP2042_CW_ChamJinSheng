package FroggerApp.Menu_Scene;

import javafx.scene.Scene;

public class menuScene_Controller {
    private menuScene_View view;
    private menuScene_Model model;

    public menuScene_Controller(menuScene_View view,menuScene_Model model){
        this.view = view;
        this.model = model;
    }

    public Scene getScene(){
        return model.getScene();
    }

    public void setScene(Scene scene){
        model.setScene(scene);
    }

    public void runMenuScene() throws Exception {
        view.menuStart(model.getInfoStage(),model.getRoot(),model.getScene(),model.getStartButton(),model.getInfoButton());
        model.setStartButton(model.getStartButton());
        model.setInfoButton(model.getInfoButton());
    }
}
