package FroggerApp.Scene_Manager;

import FroggerApp.Game_Scene.gameScene_Controller;
import FroggerApp.Game_Scene.gameScene_Model;
import FroggerApp.Game_Scene.gameScene_View;
import FroggerApp.Info_Scene.infoScene_Controller;
import FroggerApp.Info_Scene.infoScene_Model;
import FroggerApp.Info_Scene.infoScene_View;
import FroggerApp.Menu_Scene.menuScene_Controller;
import FroggerApp.Menu_Scene.menuScene_Model;
import FroggerApp.Menu_Scene.menuScene_View;
import javafx.stage.Stage;

/**
 * sceneManager class
 */
public class sceneManager {

    Stage stage;

    /**
     * Constructor to take stage parameter
     * @param stage current stage
     */
    public sceneManager(Stage stage){
        this.stage = stage;
    }

    /**
     * toGameScene method to change current scene to Game Scene
     */
    public void toGameScene(){
        gameScene_View view = new gameScene_View();
        gameScene_Model model = new gameScene_Model(stage);
        gameScene_Controller controller= new gameScene_Controller(model,view);
        try {
            controller.runGameScene();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * toInfoScene method to change current scene to Info Scene
     */
    public void toInfoScene(){
        infoScene_View view = new infoScene_View();
        infoScene_Model model = new infoScene_Model(stage);
        infoScene_Controller controller= new infoScene_Controller(view,model);
        try {
            controller.runInfoScene();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * toMenuScene method to change current scene to Menu Scene
     */
    public void toMenuScene(){
        menuScene_View view = new menuScene_View();
        menuScene_Model model = new menuScene_Model(stage);
        menuScene_Controller controller = new menuScene_Controller(view, model);
        try{
            controller.runMenuScene();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
