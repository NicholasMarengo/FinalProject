package events;
import teams.Team;

public class StackItemList {
	private StackItem last;

	public StackItem getLast() {
		return last;
	}

	public void setLast(StackItem last) {
		this.last = last;
	}
	
	public void push(Team nugget) {
		StackItem stacked = new StackItem(nugget);
		if (last == null) {
			last = stacked;
		}
	}
	
	public Team pop (){
		
		if (last == null){
			return null;
		} else {
			Team returnTeam = last.getTeam();
				return returnTeam;
		}
	}
}
