package FroggerApp.Actor;

import javafx.scene.image.Image;

public class WetTurtle extends Actor{

	private Image turtle1;
	private Image turtle2;
	private Image turtle3;
	private Image turtle4;

	private int time = 900000000;
	private int counter = 4;
	private int speed;

	private boolean sunk = false;

	@Override
	/**
	 * Act method to change the current wetTurtle images and speed
	 */
	public void act(long now) {

				if (now/time  % counter == 0) {
					setImage(turtle2);
					sunk = false;
					
				}
				else if (now/time % counter == 1) {
					setImage(turtle1);
					sunk = false;
				}
				else if (now/time % counter == 2) {
					setImage(turtle3);
					sunk = false;
				} else if (now/time % counter == 3) {
					setImage(turtle4);
					sunk = true;
				}
			
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}

	/**
	 * WetTurtle constructor to set parameters of wetTurtles in game scene
	 * @param xpos x-axis of wetTurtle in game scene
	 * @param ypos y-axis of wetTurtle in game scene
	 * @param s moving speed of wetTurtle in game scene
	 * @param w image width of wetTurtle
	 * @param h image height of wetTurtle
	 */
	public WetTurtle(int xpos, int ypos, int s, int w, int h) {
		turtle1 = new Image("file:src/FroggerApp/Images_File/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:src/FroggerApp/Images_File/TurtleAnimation2Wet.png", w, h, true, true);
		turtle3 = new Image("file:src/FroggerApp/Images_File/TurtleAnimation3Wet.png", w, h, true, true);
		turtle4 = new Image("file:src/FroggerApp/Images_File/TurtleAnimation4Wet.png", w, h, true, true);
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}

	/**
	 * isSunk method to check whether turtle is sunk in water
	 * @return true if turtle sunk, false if turtle not sunk
	 */
	public boolean isSunk() {
		return sunk;
	}
	public boolean getLeft() {
		return speed < 0;
	}
}
