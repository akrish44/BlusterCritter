import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;

import java.util.ArrayList;

/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class BlusterCritter extends Critter {

    private int c;
    private int counter = 0;

    public BlusterCritter() {

        
        int c = 3;
        
    }



    public ArrayList getCritters() {

        ArrayList<Actor> actors = new ArrayList<Actor>(); 

        Location loc = getLocation();
        for (int r = loc.getRow() - 2; r<=loc.getRow() + 2; r++) {
            for (int c = loc.getCol() - 2; c <=loc.getCol() + 2; c++) {
                Location temp = new Location(r, c);
                if (getGrid().isValid(temp)) {
                    Actor a = getGrid().get(temp);
                    if (a != null && a != this) {
                        actors.add(a);
                    }
                }
               
            }

        }
        return actors;

    }

        public void processActors() {



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
                if (counter < c) {
                    lighten();
                } else {
                    darken();
                }
            }
        }



        public void darken() {
             

             double DARKENING_FACTOR = 0.05;
             Color color = getColor(); 
             int red = (int) (c.getRed() * (1 - DARKENING_FACTOR)); 
             int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR)); 
             int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR)); 

        }

        public getGreen() {

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
