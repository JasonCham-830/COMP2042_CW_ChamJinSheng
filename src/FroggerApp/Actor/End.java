package FroggerApp.Actor;

import javafx.scene.image.Image;

/**
 * End class
 */
public class End extends Actor{
	private boolean activated = false;

	@Override
	/**
	 * Empty method from abstract class
	 */
	public void act(long now) {
		// TODO Auto-generated method st
	}

	/**
	 * End constructor to set End image in game scene
	 * @param x x-axis of image
	 * @param y y-axis of image
	 */
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:src/FroggerApp/Images_File/End.png", 60, 60, true, true));
	}

	/**
	 * setEnd method to set image when frog enter the coves
	 */
	public void setEnd() {
		setImage(new Image("file:src/FroggerApp/Images_File/FrogEnd.png", 70, 70, true, true));
		activated = true;
	}
	
	public boolean isActivated() {
		return activated;
	}
	

}
