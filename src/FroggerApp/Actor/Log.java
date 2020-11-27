package FroggerApp.Actor;

import javafx.scene.image.Image;

/**
 * Log class
 */
public class Log extends Actor {

	private double speed;

	/**
	 * Act method to change the current position of log
	 * @param now Current position of objects
	 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX()>600 && speed>0)
			setX(-180);
		if (getX()<-300 && speed<0)
			setX(700);
	}

	/**
	 * Log constructor to set log image and movement parameters in game scene
	 * @param imageLink Log image link
	 * @param size Image size
	 * @param xpos Image x-axis position
	 * @param ypos Image y-axis position
	 * @param s Image speed in game
	 */
	public Log(String imageLink, int size, int xpos, int ypos, double s) {
		setImage(new Image(imageLink, size,size, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
	}

	/**
	 * getLeft method to return true when image is out of stage
	 * @return true when log is out of stage
	 */
	public boolean getLeft() {
		return speed < 0;
	}
}
