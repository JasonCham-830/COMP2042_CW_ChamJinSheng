package FroggerApp.Actor;

import javafx.scene.image.Image;

/**
 * Digit class
 */
public class Digit extends Actor{

	private Image image;
	@Override
	/**
	 * Empty method from abstract class
	 */
	public void act(long now) {}

	/**
	 * Digit constructor to display digits in the scoreboard
	 * @param n Number to call number image for scoreboard
	 * @param dim Requested width of image
	 * @param x x-axis of score
	 * @param y y-axis of score
	 */
	public Digit(int n, int dim, int x, int y) {
		image = new Image("file:src/FroggerApp/Images_File/"+n+".png", dim, dim, true, true);
		setImage(image);
		setX(x);
		setY(y);
	}
	
}
