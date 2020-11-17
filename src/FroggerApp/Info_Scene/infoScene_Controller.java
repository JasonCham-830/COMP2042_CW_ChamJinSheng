package FroggerApp.Info_Scene;


import javafx.scene.Scene;


public class infoScene_Controller {
    private infoScene_View view;
    private infoScene_Model model;

    public infoScene_Controller(infoScene_View view,infoScene_Model model){
        this.view = view;
        this.model = model;
    }

    public Scene getScene(){
        return model.getScene();
    }

    public void setScene(Scene scene){
        model.setScene(scene);
    }

    public void runInfoScene() throws Exception {
        view.infoStart(model.getInfoStage(),model.getRoot(),model.getScene(),model.getButton());
        model.setButton(model.getButton());
    }
}
