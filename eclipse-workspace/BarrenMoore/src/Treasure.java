
public class Treasure {

	static int TreasureHeightY = (int) Math.floor(Math.random()*Grid.GRIDSIZE);
	static int TreasureWidthX = (int) Math.floor(Math.random()*Grid.GRIDSIZE);
	Grid myGrid = new Grid();
	
	public boolean isTreasure() { 
		
		if ((TreasureHeightY == myGrid.getHeight()) && (TreasureWidthX == myGrid.getWidth())) {
			System.out.println("YOU HAVE FOUND THE TREASURE AND WON THE GAME");
			Main.End =true;
			return Main.End = true;
		}
		else
			System.out.println("keep searching!");
		return Main.End = false;
	}
	
	public double distanceFromTreasure() { // calculate the distance from the treasure
		int distX =(TreasureWidthX-myGrid.getWidth()); // X distance from treasure
		int distY =(TreasureHeightY-myGrid.getHeight());//Ydistance from treasure
		
		double distXSq = Math.pow(distX, 2); // calculating the distances squared
		double distYSq = Math.pow(distY, 2);
		
		double distanceFromTreasure = Math.sqrt(distXSq+distYSq)*100;// square root of the two distances squared
		double dist = Math.round(distanceFromTreasure);
		return dist/100;
	}
}
