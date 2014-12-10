package events;
import teams.Team;


public class StackItem {
	private Team team;

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team t) {
		team = t;
	}
	
	public StackItem(){
		
	}
	
	public StackItem(Team t){
		team = t;
		
	}
	
	
}
