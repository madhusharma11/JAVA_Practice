package com.voter.entities;

public class Candidate {

	//| | id | name    | party    | votes
	private int candidateId;
	private String cName;
	private String partyName;
	private static int votes=0;
	public Candidate(int candidateId, String cName, String partyName) {
		super();
		this.candidateId = candidateId;
		this.cName = cName;
		this.partyName = partyName;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public static int getVotes() {
		return votes;
	}
	public static void setVotes(int votes) {
		Candidate.votes = votes;
	}
	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", cName=" + cName + ", partyName=" + partyName + "]";
	}
	
	
	
	
	
}

