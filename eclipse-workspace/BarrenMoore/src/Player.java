
public class Player {

	
	public void startGame() {
		System.out.println("You have entered into the Barren Moore in search of treasure, with only your Magic Compass and Map with you");
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		Event T1 = new Trap();
		Event A1 = new Aligator();
		Event S1 = new Skeleton();
		Event.Events.add(S1);
		Event.Events.add(A1);
		Event.Events.add(T1);
	}
}
