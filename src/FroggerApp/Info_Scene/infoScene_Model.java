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


public class infoScene_Model {

    private Stage infoStage;
    private Scene scene;
    private Button startButton;
    private Group root;

    public infoScene_Model(Stage infoStage){
        this.infoStage = infoStage;
        root = new Group();
        this.scene = new Scene(root,600,800);
        startButton = new Button("Start game");
    }

    public Button getButton(){
        return startButton;
    }

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

    public Scene getScene(){
        return scene;
    }

    public void setScene(Scene scene){
        this.scene = scene;
    }

    public Group getRoot(){
        return root;
    }

    public void setRoot(Group root){
        this.root = root;
    }

    public Stage getInfoStage(){
        return infoStage;
    }

    public void setInfoStage(Stage infoStage){
        this.infoStage = infoStage;
    }

}
