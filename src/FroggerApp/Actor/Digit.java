package FroggerApp.Actor;

import javafx.scene.image.Image;

public class Digit extends Actor{

	private Image image;
	@Override
	public void act(long now) {}
	
	public Digit(int n, int dim, int x, int y) {
		image = new Image("file:src/FroggerApp/Images_File/"+n+".png", dim, dim, true, true);
		setImage(image);
		setX(x);
		setY(y);
	}
	
}
