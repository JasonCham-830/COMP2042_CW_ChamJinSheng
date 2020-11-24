package FroggerApp.Game_Scene;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class gameTest{

    private gameScene_Model model;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp(){
        model = new gameScene_Model();
        testSetNumber();
    }

    @Test
    public void testSetNumber() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Negative Score is not allowed");
        model.setNumber(-1);
    }
}