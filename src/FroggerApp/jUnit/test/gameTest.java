package FroggerApp.jUnit.test;

import FroggerApp.Game_Scene.gameScene_Model;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class gameTest{

    private gameScene_Model model;

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void testSetNumber() {
        model = new gameScene_Model();
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Negative Score is not allowed");
        model.setNumber(-1);
    }
}