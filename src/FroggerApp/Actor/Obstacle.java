package FroggerApp.Actor;

import javafx.scene.image.Image;

/**
 * Obstacle class
 */
public class Obstacle extends Actor {
	private int speed;

	@Override
	/**
	 * Act method to set obstacle start point, end point and speed in game scene
	 */
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -50 && speed<0)
			setX(600);
	}

	/**
	 * Obstacle constructor to set the parameters of obstacles in game
	 * @param imageLink URL link for obstacle imaage
	 * @param xpos x-axis of obstacle in game scene
	 * @param ypos y-axis of obstacle in game scene
	 * @param s Moving speed of obstacle in game scene
	 * @param w Image width of obstacle
	 * @param h Image height of obstacle
	 */
	public Obstacle(String imageLink, int xpos, int ypos, int s, int w, int h) {
		setImage(new Image(imageLink, w,h, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
	}

}
