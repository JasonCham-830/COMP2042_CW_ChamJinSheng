package FroggerApp.Menu_Scene;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.rmi.server.ExportException;

import static org.junit.Assert.*;

public class menuScene_ModelTest {

    private menuScene_Model model;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void InvalidInfoButtonTest(){
        thrown.expect(NullPointerException.class);
        model = new menuScene_Model();
        model.setInfoButton(model.getInfoButton());
    }
}