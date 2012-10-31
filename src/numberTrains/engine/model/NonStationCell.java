package numberTrains.engine.model;

/**
 * A model class representing a cell on the gameboard that is not a station and
 * contain a number of tracks in this cell.
 * 
 * TODO: think of a better name for this class.
 * 
 * @author Lucas
 * 
 */
public class NonStationCell {
	//
	private Track activeTrack;
	private Track inactiveTrack;

	public Track getTrack1() {
		return activeTrack;
	}

	public void setTrack1(Track track1) {
		this.activeTrack = track1;
	}

	public Track getTrack2() {
		return inactiveTrack;
	}

	public void setTrack2(Track track2) {
		this.inactiveTrack = track2;
	}
	
	public void switchTracks() {
		if (inactiveTrack != null) {
			Track tempTrack = activeTrack;
			inactiveTrack = activeTrack;
			activeTrack = tempTrack;
		}
	}

}
