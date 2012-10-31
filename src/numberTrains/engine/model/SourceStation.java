package numberTrains.engine.model;


/**
 * A model class for a source station. This is a station from which trains will
 * enter the game.
 * 
 * @author Lucas
 * 
 */
public abstract class SourceStation {
	private Direction exit;

	public Direction getExit() {
		return exit;
	}

	public void setExit(Direction exit) {
		this.exit = exit;
	}

}
