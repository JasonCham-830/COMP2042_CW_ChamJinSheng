package FroggerApp.Actor;

import FroggerApp.World.World;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

/**
 * Actor abstract class
 */
public abstract class Actor extends ImageView{

    /**
     * Method to move the frog
     * @param dx Move x-axis
     * @param dy Move y-axis
     */
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    /**
     * Method use to get Word class
     * @return World getParent()
     */
    public World getWorld() {
        return (World) getParent();
    }

    /**
     * Method to get intersecting objects in Game Scene
     * @param cls Class
     * @param <A> Actor
     * @return ArrayList for intersecting objects
     */
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }

    /**
     * Abstract method for subclasses to act
     * @param now Current position of objects
     */
    public abstract void act(long now);

}
