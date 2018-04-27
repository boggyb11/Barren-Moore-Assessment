
public class Aligator extends Event {
	
	Grid myGrid = new Grid();

	@Override
	public boolean isTrue() {
		int EventY = (int) Math.floor(Math.random()*Grid.GRIDSIZE);
		int EventX = (int) Math.floor(Math.random()*Grid.GRIDSIZE);
		
		if ((EventY == myGrid.getHeight()) && (EventX == myGrid.getWidth())) {
			
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.println(" You come across an Aligator forcing you to run south !!");
			System.out.println("------------------------------------------------------------------------------------------------------");
			myGrid.movedSouth();
			
			Main.foundEvent=true;
			return Main.foundEvent = true;
			
		}
		else
		return Main.foundEvent= false;
	}
	}


