package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> GamePlayers;
	
	

	public UUID getGameID() {
		return GameID;
	}
	
	public void setGameID(UUID gameID) {
		this.GameID = gameID;
	}
	
	public UUID getTableID() {
		return TableID;
	}
	
	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		this.GamePlayers = gamePlayers;
	}
	
	public Game(){
		this.GameID = UUID.randomUUID();

	}
	public Game(ArrayList<Player> gamePlayers, UUID TableID){
		this();
		this.TableID = TableID;
		this.GamePlayers=  new ArrayList<Player>();	
	}


}
