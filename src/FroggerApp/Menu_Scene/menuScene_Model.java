package FroggerApp.Menu_Scene;

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
public class menuScene_Model {
    private Stage menuStage;
    private Scene scene;
    private Group root;
    private Button startButton;
    private Button infoButton;

    public menuScene_Model(){}

    /**
     * MenuScene Model constructor
     * @param menuStage Menu stage for application
     */
    public menuScene_Model(Stage menuStage){
        this.menuStage = menuStage;
        root = new Group();
        this.scene = new Scene(root, 600, 800);
        startButton = new Button();
        infoButton = new Button();
    }

    /**
     * getStartButton method to get start button in menu scene
     * @return startButton
     */
    public Button getStartButton(){
        return startButton;
    }

    /**
     * setStartButton method to link the menu scene to game scene
     * @param startButton Start button in menu scene
     */
    public void setStartButton(Button startButton){
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sceneManager sm = new sceneManager(menuStage);
                sm.toGameScene();
            }
        });
    }

    /**
     * getInfoButton method to get info button in menu scene
     * @return infoButton
     */
    public Button getInfoButton(){
        return infoButton;
    }

    /**
     * setInfoButton method to link the menu scene to info scene
     * @param infoButton Info button in menu scene
     */
    public void setInfoButton(Button infoButton){
        infoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                sceneManager sm = new sceneManager(menuStage);
                sm.toInfoScene();
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
