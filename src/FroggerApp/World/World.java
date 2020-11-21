package FroggerApp.World;


import java.util.ArrayList;
import java.util.List;

import FroggerApp.Actor.Actor;
import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;


/**
 * World abstarct class
 */
public abstract class World extends Pane {
    private AnimationTimer timer;

	/**
	 * World constructor to handle events of game
	 */
	public World() {
    	
    	sceneProperty().addListener(new ChangeListener<Scene>() {

			@Override

			public void changed(ObservableValue<? extends Scene> observable, Scene oldValue, Scene newValue) {
				if (newValue != null) {
					newValue.setOnKeyReleased(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyReleased() != null) 
								getOnKeyReleased().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyReleased() != null) {
									anActor.getOnKeyReleased().handle(event);
								}
							}
						}
						
					});
					
					newValue.setOnKeyPressed(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyPressed() != null) 
								getOnKeyPressed().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyPressed() != null) {
									anActor.getOnKeyPressed().handle(event);
								}
							}
						}
						
					});
				}
				
			}
    		
		});
    }

	/**
	 * createTimer method to generate a timer during game scene for animation purpose
	 */
	public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                act(now);
                List<Actor> actors = getObjects(Actor.class);
                
                for (Actor anActor: actors) {
                	anActor.act(now);
                }
      
            }
        };
    }

	/**
	 * start method to start the timer
	 */
	public void start() {
    	createTimer();
        timer.start();
    }

    /**
	 * stop method to stop the timer
     */
    public void stop() {
        timer.stop();
    }

	/**
	 * add method to add each actor in game scene
	 * @param actor Any actors that appears in game scene
	 */
	public void add(Actor actor) {
        getChildren().add(actor);
    }

	/**
	 * Find the location of actors and store it in array
	 * @param cls Actor class
	 * @param <A> Actor
	 * @return Array containing actors in world
	 */
    public <A extends Actor> List<A> getObjects(Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (Node n: getChildren()) {
            if (cls.isInstance(n)) {
                someArray.add((A)n);
            }
        }
        return someArray;
    }

	/**
	 * Abstract method act
	 * @param now Current time
	 */
	public abstract void act(long now);
}
