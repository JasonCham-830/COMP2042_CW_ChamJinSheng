package FroggerApp.jUnit.test;

import FroggerApp.Actor.Obstacle;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ObstacleTest {

    private Obstacle obstacle;

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void testBackgroundImageInvalidImg() {
        thrown.expect(IllegalArgumentException.class);
        obstacle = new Obstacle("Invalid URL link",20,40,12,55,100);
    }

}