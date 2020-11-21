package FroggerApp.Info_Scene;


import javafx.scene.Scene;

/**
 * InfoScene Controller class
 */
public class infoScene_Controller {
    private infoScene_View view;
    private infoScene_Model model;

    /**
     * InfoScene_Controller constructor to call its view and model
     * @param view infoScene_View
     * @param model infoScene_Model
     */
    public infoScene_Controller(infoScene_View view,infoScene_Model model){
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
     * @param scene Set current info scene
     */
    public void setScene(Scene scene){
        model.setScene(scene);
    }

    /**
     * Run InfoScene by parsing parameters to view and invokes model's setButton method
     * @throws Exception
     */
    public void runInfoScene() throws Exception {
        view.infoStart(model.getInfoStage(),model.getRoot(),model.getScene(),model.getButton());
        model.setButton(model.getButton());
    }
}
