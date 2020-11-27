package FroggerApp.Info_Scene;

import FroggerApp.Menu_Scene.menuScene_Model;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class infoScene_ModelTest {

        private infoScene_Model model;

        @Rule
        public ExpectedException thrown = ExpectedException.none();

        @Test
        public void InvalidStartButtonTest(){
            thrown.expect(NullPointerException.class);
            model = new infoScene_Model(model.getInfoStage());
            model.setButton(model.getButton());
    }

}