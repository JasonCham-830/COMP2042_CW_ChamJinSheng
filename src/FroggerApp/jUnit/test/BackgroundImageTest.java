package FroggerApp.jUnit.test;

import FroggerApp.Actor.BackgroundImage;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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