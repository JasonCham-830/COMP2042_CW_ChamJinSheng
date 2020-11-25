package FroggerApp.Info_Scene;

import FroggerApp.Game_Scene.gameScene_Controller;
import FroggerApp.Game_Scene.gameScene_Model;
import FroggerApp.Game_Scene.gameScene_View;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * InfoScene Model
 */
public class infoScene_Model {

    private Stage infoStage;
    private Scene scene;
    private Button startButton;
    private Group root;

    /**
     * InfoScene_Model constructor
     * @param infoStage Stage for infoScene
     */
    public infoScene_Model(Stage infoStage){
        this.infoStage = infoStage;
        root = new Group();
        this.scene = new Scene(root,600,800);
        startButton = new Button();
    }

    /**
     * getButton method to getStartButton
     * @return startButton
     */
    public Button getButton(){
        return startButton;
    }

    /**
     * setButton method to set button functions that link to Game Scene
     * @param startButton startButton
     */
    public void setButton(Button startButton){
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                gameScene_View view = new gameScene_View();
                gameScene_Model model = new gameScene_Model(infoStage);
                gameScene_Controller controller= new gameScene_Controller(model,view);
                try {
                    controller.runGameScene();
                } catch (Exception e) {
                    e.printStackTrace();
                }
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
     * setScene method to set current info scene
     * @param scene Current info scene
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
     * setRoot method to set current root in info scene
     * @param root root(Group)
     */
    public void setRoot(Group root){
        this.root = root;
    }

    /**
     * getInfoStage method to get stage
     * @return infoStage
     */
    public Stage getInfoStage(){
        return infoStage;
    }

    /**
     * setInfoStage method to set current info stage
     * @param infoStage Current info stage
     */
    public void setInfoStage(Stage infoStage){
        this.infoStage = infoStage;
    }

}
