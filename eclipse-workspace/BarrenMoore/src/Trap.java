
public class Trap extends Event{

	
	Grid myGrid = new Grid();
	textOptions myOptions = new textOptions();

	public boolean isTrue() { 
		int EventY = (int) Math.floor(Math.random()*Grid.GRIDSIZE);
		int EventX = (int) Math.floor(Math.random()*Grid.GRIDSIZE);
		
		if ((EventY == myGrid.getHeight()) && (EventX == myGrid.getWidth())) {
			myOptions.trapOptions();
			Main.End=true;
			return Main.End = true;
			
		}
		else
		return Main.End= false;
	}
	
}
