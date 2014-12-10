package Queues;
import teams.*;

public class QueueItem {
	private QueueItem next;
	private Team team;
	
	
	public QueueItem (){
		this.next = null;
		this.team = null;
	}
	
	public QueueItem(Team t) {
		this.next = null;
		this.team = t;
	}

	public QueueItem getNext() {
		return next;
	}


	public Team getTeam() {
		return team;
	}


	public void setNext(QueueItem next) {
		this.next = next;
	}


	public void setTeam(Team team) {
		this.team = team;
	}
	
	
	
	
	
	
	
}
