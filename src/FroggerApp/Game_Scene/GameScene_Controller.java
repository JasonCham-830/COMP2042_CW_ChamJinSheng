package FroggerApp.Game_Scene;

import javafx.scene.Scene;

public class GameScene_Controller {
    private GameScene_View view;
    private GameScene_Model model;

    public GameScene_Controller(GameScene_Model model, GameScene_View view){
        this.model = model;
        this.view = view;
    }

//    public GameScene_Model getModel(){
//        return model;
//    }

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
