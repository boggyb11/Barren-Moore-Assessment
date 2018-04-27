
public class Skeleton extends Event {
	
	Grid myGrid = new Grid();

	@Override
	public boolean isTrue() {
		int EventY = (int) Math.floor(Math.random()*Grid.GRIDSIZE);
		int EventX = (int) Math.floor(Math.random()*Grid.GRIDSIZE);
		
		if ((EventY == myGrid.getHeight()) && (EventX == myGrid.getWidth())) {
			
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.println(" You trip over a Skeleton making you run in fear!!");
			System.out.println("------------------------------------------------------------------------------------------------------");
			myGrid.movedEast();
			
			Main.foundEvent=true;
			return Main.foundEvent = true;
			
		}
		else
		return Main.foundEvent= false;
	}
	}