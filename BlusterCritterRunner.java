import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class BlusterCritterRunner {

	public static void main(String[] args)
	{
	    ActorWorld world = new ActorWorld();
	    world.add(new Location(4, 4), new BlusterCritter());
	    world.add(new Location(5, 8), new BlusterCritter());
	    world.add(new Location(6, 8), new BlusterCritter());
	    world.add(new Location(7, 8), new BlusterCritter());
	    world.add(new Location(8, 8), new BlusterCritter());
	    world.show();
	}
}
