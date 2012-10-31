package numberTrains.engine.model;


/**
 * A model class for destination station. This is a station trains will try to
 * enter to satisfy the game objectives. Trains must match the station's number;
 * 
 * @author Lucas
 * 
 */
public class DestinationStation {
	private Direction entrance;
	private int stationNumber;

	public Direction getEntrance() {
		return entrance;
	}

	public void setEntrance(Direction entrance) {
		this.entrance = entrance;
	}

	public int getStationNumber() {
		return stationNumber;
	}

	public void setStationNumber(int stationNumber) {
		this.stationNumber = stationNumber;
	}

}
