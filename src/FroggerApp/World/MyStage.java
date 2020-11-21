package FroggerApp.World;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * MyStage class
 */
public class MyStage extends World{
	private MediaPlayer mediaPlayer;
	@Override
	/**
	 * Empty act method
	 */
	public void act(long now) {	}

	/**
	 * Empty constructor
	 */
	public MyStage() {}

	/**
	 * Loads mp3 file and play background music during game scene
	 */
	public void playMusic() {
		String musicFile = "src/FroggerApp/Audio_File/Frogger Main Song Theme (loop).mp3";
		Media sound = new Media(new File(musicFile).toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	}

	/**
	 * Stop the music
	 */
	public void stopMusic() {
		mediaPlayer.stop();
	}

}
