package events;

import teams.Team;

/**
 * The event manager manages the events in the application
 */
public class EventManager {
    private Event[] events;
    private Team[] teamArray;

    /**
     * Construct a new EventManager
     */
    public EventManager() {
        events = new Event[] {
                new WashoosEvent(),
                new HorseshoesEvent(),
                new CornHoleEvent(),
                new CanJamEvent(),
                new LadderBallEvent(),
                new StickGameEvent()
        };
    
    
    
    
    }

    /**
     * Retrieve the events
     *
     * @return the events
     */
    public Event[] getEvents() {
        return events;
    }
    
    public Team[] getTeams() {
    	return teamArray;
    	
    }
    
    }
    
    