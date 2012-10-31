package numberTrains.engine.model;


/**
 * A model class for a track a train can move across from one direction to
 * another. A track is bi-directional.
 * 
 * @author Lucas
 * 
 */
public class Track {
	private Direction direction1;
	private Direction direction2;

	public Direction getDirection1() {
		return direction1;
	}

	public void setDirection1(Direction direction1) {
		this.direction1 = direction1;
	}

	public Direction getDirection2() {
		return direction2;
	}

	public void setDirection2(Direction direction2) {
		this.direction2 = direction2;
	}
}
