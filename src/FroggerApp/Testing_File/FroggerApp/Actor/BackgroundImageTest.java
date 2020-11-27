package FroggerApp.Actor;

import FroggerApp.Game_Scene.gameScene_Model;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class BackgroundImageTest {

    private BackgroundImage backgroundImage;

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void testBackgroundImageInvalidImg() {
        thrown.expect(IllegalArgumentException.class);
        backgroundImage = new BackgroundImage("Invalid URL link");
    }

}