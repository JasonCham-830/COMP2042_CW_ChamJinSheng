package FroggerApp.Level_Scene;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import FroggerApp.Scene_Manager.sceneManager;

/**
 * MenuScene Model class
 */
public class levelScene_Model {
    private Stage menuStage;
    private Scene scene;
    private Group root;
    private Button level1Button;
    private Button level2Button;

    /**
     * LevelScene Model constructor
     * @param menuStage Menu stage for application
     */
    public levelScene_Model(Stage menuStage){
        this.menuStage = menuStage;
        root = new Group();
        this.scene = new Scene(root, 600, 800);
        level1Button = new Button();
        level2Button = new Button();
    }

    /**
     * getLevel1Button method to get easy button in level scene
     * @return level1Button
     */
    public Button getLevel1Button(){
        return level1Button;
    }

    /**
     * setLevel1Button method to link the level scene to easy mode game scene
     * @param level1Button Easy button in level scene
     */
    public void setLevel1Button(Button level1Button){
        level1Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sceneManager sm = new sceneManager(menuStage);
                sm.toGameSceneEasy();
            }
        });
    }

    /**
     * getLevel2Button method to get hardMode button in level scene
     * @return level2Button
     */
    public Button getLevel2Button(){
        return level2Button;
    }

    /**
     * setLevel2Button method to link the level scene to hard mode game scene
     * @param level2Button Hard button in menu scene
     */
    public void setLevel2Button(Button level2Button){
        level2Button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sceneManager sm = new sceneManager(menuStage);
                sm.toGameSceneHard();
            }
        });
    }

    /**
     * getScene method to get scene
     * @return scene(Scene)
     */
    public Scene getScene(){
        return scene;
    }

    /**
     * setScene method to set current menu scene
     * @param scene Current menu scene
     */
    public void setScene(Scene scene){
        this.scene = scene;
    }

    /**
     * getRoot method to get root
     * @return root
     */
    public Group getRoot(){
        return root;
    }

    /**
     * setRoot method to set current root in menu scene
     * @param root root(Group)
     */
    public void setRoot(Group root){
        this.root = root;
    }

    /**
     * getMenuStage method to get stage
     * @return menuStage
     */
    public Stage getMenuStage(){
        return menuStage;
    }

    /**
     * setMenuStage method to set current menu stage
     * @param menuStage Current menu stage
     */
    public void setMenuStage(Stage menuStage){
        this.menuStage = menuStage;
    }
}
