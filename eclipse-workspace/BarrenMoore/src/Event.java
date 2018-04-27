import java.util.ArrayList;

abstract public class Event {

	int EventX;
	int EventY;
	
	public static ArrayList<Event> Events = new ArrayList<>();
	
	abstract public boolean isTrue();
	


}
