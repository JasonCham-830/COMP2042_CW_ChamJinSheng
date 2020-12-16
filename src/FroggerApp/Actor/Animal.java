package FroggerApp.Actor;

import java.util.ArrayList;

import javafx.event.EventHandler;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 * Animal class
 */
public class Animal extends Actor {

	private int points = 0;
	private int end = 0;
	private int imgSize = 40;
	private int carD = 0;

	private double movement = 13.3333333*2;
	private double movementX = 10.666666*2;
	private double w = 800;
	private static double logLSpeed=0;
	private static double logRSpeed=0;
	private static double WetLSpeed=0;
	private static double WetRSpeed=0;

	private boolean second = false;
	private boolean noMove = false;
	private boolean carDeath = false;
	private boolean waterDeath = false;
	private boolean changeScore = false;
	private boolean stop = false;

	ArrayList<End> inter = new ArrayList<End>();

	public Animal(){};

	public static void setSpeed(double logL, double logR, double turtleL, double turtleR){
		logLSpeed=logL;
		logRSpeed=logR;
		WetLSpeed=turtleL;
		WetRSpeed=turtleR;
		System.out.println(logLSpeed);
	}
	/**
	 * Animal Constructor to set parameters for frog in game scene
	 * @param imageLink imageLink for frog images during game scene
	 */
	public Animal(String imageLink) {
		setImage(new Image(imageLink, imgSize, imgSize, true, true));
		setX(300);
		setY(679.8+movement);

		Image imgW1 = new Image("file:src/FroggerApp/Images_File/froggerUp.png", imgSize, imgSize, true, true);
		Image imgA1 = new Image("file:src/FroggerApp/Images_File/froggerLeft.png", imgSize, imgSize, true, true);
		Image imgS1 = new Image("file:src/FroggerApp/Images_File/froggerDown.png", imgSize, imgSize, true, true);
		Image imgD1 = new Image("file:src/FroggerApp/Images_File/froggerRight.png", imgSize, imgSize, true, true);
		Image imgW2 = new Image("file:src/FroggerApp/Images_File/froggerUpJump.png", imgSize, imgSize, true, true);
		Image imgA2 = new Image("file:src/FroggerApp/Images_File/froggerLeftJump.png", imgSize, imgSize, true, true);
		Image imgS2 = new Image("file:src/FroggerApp/Images_File/froggerDownJump.png", imgSize, imgSize, true, true);
		Image imgD2 = new Image("file:src/FroggerApp/Images_File/froggerRightJump.png", imgSize, imgSize, true, true);


		setOnKeyPressed(new EventHandler<KeyEvent>() {
			/**
			 * Handle class to handle event for frog during movements
			 * @param FrogImgEvent Every event for frog in game scene
			 */
			public void handle(KeyEvent FrogImgEvent){
				if (noMove) {
				}
				else {
				if (second) {
					if (FrogImgEvent.getCode() == KeyCode.W) {
		                move(0, -movement);
		                changeScore = false;
		                setImage(imgW1);
		                second = false;
		            }
		            else if (FrogImgEvent.getCode() == KeyCode.A) {
		            	 move(-movementX, 0);
		            	 setImage(imgA1);
		            	 second = false;
		            }
		            else if (FrogImgEvent.getCode() == KeyCode.S) {
		            	 move(0, movement);
		            	 setImage(imgS1);
		            	 second = false;
		            }
		            else if (FrogImgEvent.getCode() == KeyCode.D) {
		            	 move(movementX, 0);
		            	 setImage(imgD1);
		            	 second = false;
		            }
				}
				else if (FrogImgEvent.getCode() == KeyCode.W) {
	                move(0, -movement);
	                setImage(imgW2);
	                second = true;
	            }
	            else if (FrogImgEvent.getCode() == KeyCode.A) {
	            	 move(-movementX, 0);
	            	 setImage(imgA2);
	            	 second = true;
	            }
	            else if (FrogImgEvent.getCode() == KeyCode.S) {
	            	 move(0, movement);
	            	 setImage(imgS2);
	            	 second = true;
	            }
	            else if (FrogImgEvent.getCode() == KeyCode.D) {
	            	 move(movementX, 0);
	            	 setImage(imgD2);
	            	 second = true;
	            }
	        }
			}
		});	
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			/**
			 * Handle event to track score when frog makes a move
			 * @param FrogMoveScoreEvent Event to calculate score after frog's every movement
			 */
			public void handle(KeyEvent FrogMoveScoreEvent) {
				if (noMove) {}
				else {
				if (FrogMoveScoreEvent.getCode() == KeyCode.W) {
					if (getY() < w) {
						changeScore = true;
						w = getY();
						points+=10;
					}
	                move(0, -movement);
	                setImage(imgW1);
	                second = false;
	            }
	            else if (FrogMoveScoreEvent.getCode() == KeyCode.A) {
	            	 move(-movementX, 0);
	            	 setImage(imgA1);
	            	 second = false;
	            }
	            else if (FrogMoveScoreEvent.getCode() == KeyCode.S) {
	            	 move(0, movement);
	            	 setImage(imgS1);
	            	 second = false;
	            }
	            else if (FrogMoveScoreEvent.getCode() == KeyCode.D) {
	            	 move(movementX, 0);
	            	 setImage(imgD1);
	            	 second = false;
	            }
	        }
			}
			
		});
	}

	/**
	 * Act method to set current frog's condition (Either live or dead)
	 * @param now Current position of objects
	 */
	@Override
	public void act(long now) {

		if (getY()<0 || getY()>734) {
			setX(300);
			setY(679.8+movement);
		}
		if (getX()<0) {
			move(movement*2, 0);
		}
		if (carDeath) {
			noMove = true;
			if ((now)% 11 ==0) {
				carD++;
			}
			if (carD==1) {
				setImage(new Image("file:src/FroggerApp/Images_File/cardeath1.png", imgSize, imgSize, true, true));
			}
			if (carD==2) {
				setImage(new Image("file:src/FroggerApp/Images_File/cardeath2.png", imgSize, imgSize, true, true));
			}
			if (carD==3) {
				setImage(new Image("file:src/FroggerApp/Images_File/cardeath3.png", imgSize, imgSize, true, true));
			}
			if (carD == 4) {
				setX(300);
				setY(679.8+movement);
				carDeath = false;
				carD = 0;
				setImage(new Image("file:src/FroggerApp/Images_File/froggerUp.png", imgSize, imgSize, true, true));
				noMove = false;
				if (points>50) {
					points-=50;
					changeScore = true;
				}
			}
			
		}
		if (waterDeath) {
			noMove = true;
			if ((now)% 11 ==0) {
				carD++;
			}
			if (carD==1) {
				setImage(new Image("file:src/FroggerApp/Images_File/waterdeath1.png", imgSize,imgSize , true, true));
			}
			if (carD==2) {
				setImage(new Image("file:src/FroggerApp/Images_File/waterdeath2.png", imgSize,imgSize , true, true));
			}
			if (carD==3) {
				setImage(new Image("file:src/FroggerApp/Images_File/waterdeath3.png", imgSize,imgSize , true, true));
			}
			if (carD == 4) {
				setImage(new Image("file:src/FroggerApp/Images_File/waterdeath4.png", imgSize,imgSize , true, true));
			}
			if (carD == 5) {
				setX(300);
				setY(679.8+movement);
				waterDeath = false;
				carD = 0;
				setImage(new Image("file:src/FroggerApp/Images_File/froggerUp.png", imgSize, imgSize, true, true));
				noMove = false;
				if (points>50) {
					points-=50;
					changeScore = true;
				}
			}
			
		}
		
		if (getX()>600) {
			move(-movement*2, 0);
		}
		if (getIntersectingObjects(Obstacle.class).size() >= 1) {
			carDeath = true;
		}
		if (getX() == 240 && getY() == 82) {
			stop = true;
		}
		//here
		if (getIntersectingObjects(Log.class).size() >= 1 && !noMove) {
			if(getIntersectingObjects(Log.class).get(0).getLeft()) {
				move(logLSpeed, 0);
			}
			else {
				move(logRSpeed, 0);
			}
		}
		else if (getIntersectingObjects(Turtle.class).size() >= 1 && !noMove) {
			move(WetLSpeed,0);
		}
		else if (getIntersectingObjects(WetTurtle.class).size() >= 1) {
			if (getIntersectingObjects(WetTurtle.class).get(0).isSunk()) {
				waterDeath = true;
			} else if(getIntersectingObjects(WetTurtle.class).get(0).getLeft()) {
				move(WetLSpeed,0);
			}
			else {
				move(WetRSpeed,0);
			}
		}
		else if (getIntersectingObjects(End.class).size() >= 1) {
			inter = (ArrayList<End>) getIntersectingObjects(End.class);
			if (getIntersectingObjects(End.class).get(0).isActivated()) {
				end--;
				points-=50;
			}
			points+=50;
			changeScore = true;
			w=800;
			getIntersectingObjects(End.class).get(0).setEnd();
			end++;
			setX(300);
			setY(679.8+movement);
		}
		else if (getY()<413){
			waterDeath = true;
		}
	}
	/**
	 * getStop method to get minimum number of frogs to enter coves to win the game
	 * @return
	 */
	public boolean getStop() {
		return end==5;
	}

	/**
	 * getPoints method to get the point after game ends
	 * @return
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * changeScore method to change the score in the scoreboard
	 * @return true when score is same with scoreboard, false when score is different with scoreboard
	 */
	public boolean changeScore() {
		if (changeScore) {
			changeScore = false;
			return true;
		}
		return false;
	}

}
