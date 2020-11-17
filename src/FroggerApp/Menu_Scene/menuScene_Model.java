package FroggerApp.Menu_Scene;

import FroggerApp.Game_Scene.gameScene_Controller;
import FroggerApp.Game_Scene.gameScene_Model;
import FroggerApp.Game_Scene.gameScene_View;
import FroggerApp.Info_Scene.infoScene_Controller;
import FroggerApp.Info_Scene.infoScene_Model;
import FroggerApp.Info_Scene.infoScene_View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class menuScene_Model {
    private Stage menuStage;
    private Scene scene;
    private Group root;
    private Button startButton;
    private Button infoButton;

    public menuScene_Model(Stage menuStage){
        this.menuStage = menuStage;
        root = new Group();
        this.scene = new Scene(root, 600, 800);
        startButton = new Button("Start game");
        infoButton = new Button("Game Info");
    }

    public Button getStartButton(){
        return startButton;
    }

    public void setStartButton(Button startButton){
        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                gameScene_View view = new gameScene_View();
                gameScene_Model model = new gameScene_Model(menuStage);
                gameScene_Controller controller= new gameScene_Controller(model,view);
                try {
                    controller.runGameScene();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Button getInfoButton(){
        return infoButton;
    }

    public void setInfoButton(Button infoButton){
        infoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                infoScene_View view = new infoScene_View();
                infoScene_Model model = new infoScene_Model(menuStage);
                infoScene_Controller controller= new infoScene_Controller(view,model);
                try {
                    controller.runInfoScene();
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
        return menuStage;
    }

    public void setInfoStage(Stage infoStage){
        this.menuStage = infoStage;
    }
}
