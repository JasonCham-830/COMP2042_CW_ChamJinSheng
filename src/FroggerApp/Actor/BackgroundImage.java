package FroggerApp.Actor;

import javafx.scene.image.Image;

/**
 * BackgroundImage class
 */
public class BackgroundImage extends Actor{

	@Override
	/**
	 * Empty method from abstract class
	 */
	public void act(long now) {}

	/**
	 * Constructor to set Background Image for game scene
	 * @param imageLink URL link of background image
	 */
	public BackgroundImage(String imageLink) {
		setImage(new Image(imageLink, 600, 800, true, true));
		
	}

}
