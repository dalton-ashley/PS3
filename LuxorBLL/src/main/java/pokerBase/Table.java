package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {
	private UUID TableID;
	private ArrayList<Player> TablePlayer;
	

	public UUID getTableID() {
		return TableID;
	}


	public void setTableID(UUID tableID) {
		this.TableID = tableID;
	}

	public ArrayList<Player> getTablePlayer() {
		return TablePlayer;
	}


	public void setTablePlayer(ArrayList<Player> tablePlayer) {
		this.TablePlayer = tablePlayer;
	}

	public Table(){
		this.TableID = UUID.randomUUID();

	}
	
	public Table(ArrayList<Player> TablePlayer){
		this();
		this.TablePlayer = new ArrayList<Player>();		

	}
		
}
