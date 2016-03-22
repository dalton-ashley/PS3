package pokerBase;

import java.util.UUID;

public class Player {
	
	private UUID PlayerID;
	private String PlayerName;
	private int PlayerPosition;
	
	
	public UUID getPlayerID() {
		return PlayerID;
	}
	
	public void setPlayerID(UUID playerID) {
		this.PlayerID = playerID;
	}
	
	public String getPlayerName() {
		return PlayerName;
	}
	

	public void setPlayerName(String playerName) {
		this.PlayerName = playerName;
	}
	
	public int getPlayerPosition() {
		return PlayerPosition;
	}

	public void setPlayerPosition(int playerPosition) {
		this.PlayerPosition = playerPosition;
	}

	public Player(){
		this.PlayerID = UUID.randomUUID();

	}
	
	public Player(String PlayerName, int playerPosition){
		this();
		this.PlayerName = PlayerName;
		this.PlayerPosition = playerPosition;
	
	}
}
