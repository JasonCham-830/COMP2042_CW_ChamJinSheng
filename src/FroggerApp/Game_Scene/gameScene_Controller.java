package FroggerApp.Game_Scene;

import javafx.scene.Scene;

public class gameScene_Controller {
    private gameScene_View view;
    private gameScene_Model model;

    public gameScene_Controller(gameScene_Model model, gameScene_View view){
        this.model = model;
        this.view = view;
    }


    public Scene getScene(){
        return model.getScene();
    }

    public void setScene(Scene scene){
        model.setScene(scene);
    }


    public void runGameScene() throws Exception {
        view.gameStart(model.getPrimaryStage(),model.getBackground(),model.getAnimal(),model.getScene());
        model.start();

    }
}
