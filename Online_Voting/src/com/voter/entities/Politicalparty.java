package com.voter.entities;

public class Politicalparty {

	// PartyID | PartyName  | Leader | Symbol
	private int partyID;
	private String partyNmae;
	private String leader;
	private String symbol;
	
	
	public Politicalparty(int partyID, String partyNmae, String leader, String symbol) {
		super();
		this.partyID = partyID;
		this.partyNmae = partyNmae;
		this.leader = leader;
		this.symbol = symbol;
	}
	
	
	@Override
	public String toString() {
		return "Politicalparties [partyID=" + partyID + ", partyNmae=" + partyNmae + ", leader=" + leader + ", symbol="
				+ symbol + "]";
	}
	
	
	
	
}
