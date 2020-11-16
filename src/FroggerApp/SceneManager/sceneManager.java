package FroggerApp.SceneManager;

import FroggerApp.World.MyStage;
import javafx.scene.Scene;
import FroggerApp.Game_Scene.gameScene_Model;

public class sceneManager{
    private MyStage background;
    //Scene gameScene = new Scene(getGameSceneBackground(),600,800);
    //Scene menuScene = new Scene(getMenuSceneBackground(),600,800);


    public Scene getGameScene(){
        return gameScene_Model.getScene();
    }

    public void setGameSceneBackground(MyStage background){
        this.background = background;
    }

//    public MyStage getMenuSceneBackground(){
//        return menuScene_View.getBackground();
//    }
//
//    public void setMenuSceneBackground(MyStage background){
//        this.background = background;
//    }


}


