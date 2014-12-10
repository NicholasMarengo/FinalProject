
import teams.Team; 


public class QueueItemList {

	private QueueItem first;
	private QueueItem currItem;
	
	
	
	public QueueItemList() {
		first = currItem = new QueueItem();
	}
	
	public void Enqueue(Team t) {
		QueueItem q = new QueueItem(t);
		if (first == null) {
			first = q;
			currItem = q; 
		}
		else {
			currItem.setNext(q);
			currItem = q;
		}
	}
	
	public Team Dequeue(){
		if (first == null) {
			System.out.println("the Queue is empty: cannot dequeue");
			return null;
		}
		else {
			Team returnTeam = first.getTeam();
			first = first.getNext();
			
			return returnTeam;
		}
		
	
	}
	
	public boolean isEmpty() {
		if (first == null){
			return true;
		}
		else {
			return false;
		}
	}
	
	public Team[] peakNextTeams() {
		if (first == null){
			return null;
		} else {
			Team returnTeam = first.getTeam();
			Team returnTeam2 = first.getNext().getTeam();
			
			Team[] teamArray = new Team[2];
			teamArray[0] = returnTeam;
			teamArray[1] = returnTeam2;
		}
	}
	
	public Team[] getNextTeams() {
		if(first == null) {
			return null;
		} else {
			Team nextTeam = Dequeue();
			Team nextTeam2 = Dequeue();
			
			
			Team[] teamArray = new Team[2];
			teamArray[0] = nextTeam;
			teamArray[1] = nextTeam2;
			
			return teamArray;
		}
	}
	
	void ReturnTeams(Team winner, Team loser) {
		
	}
	
	public void createQueue(Team[] nugget) {
		QueueItemList q = new QueueItemList();
		for (int i=0; i <nugget.length; i++)
		q.Enqueue(nugget[i]);
	}
	
	
	
	
	
}
