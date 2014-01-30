import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

import java.util.ArrayList;

/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class BlusterCritter extends Critter {


    public BlusterCritter() {
        private int c = 3;
        int counter = 0;
    }

    public void processActors(ArrayList<Actor> actors) {
        int n = actors.size();
        if (n == 0)
            return;
        int r = (int) (Math.random() * n);

        Actor other = actors.get(r);
        setColor(other.getColor());


        for (Actor a : actors)
        {
            if (a instanceof Critter) {
                counter++;
        }
    }
}


    public void getCritters() {
        
    }

    /**
     * Turns towards the new location as it moves.
     */
    public void makeMove(Location loc)
    {
        setDirection(getLocation().getDirectionToward(loc));
        super.makeMove(loc);
    }
}
