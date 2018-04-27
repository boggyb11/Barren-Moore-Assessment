
public class Grid {

static int GRIDSIZE = 10;
static int movement = 1;
	int [] PlayerXCoOrdinates = new int [GRIDSIZE];
	int [] PlayerYCoOrdinates = new int [GRIDSIZE];
	private static int Width;
	private static int Height;
	
	public void setStartingPosition() {
		
		//setting a random starting coordinate for X and Y
		Height = (int) Math.floor(Math.random()*PlayerYCoOrdinates.length);
		Width = (int) Math.floor(Math.random()*PlayerXCoOrdinates.length);

		System.out.println("Your Starting Coordinates are : ["+Width+","+Height+"]");
	}
	
	public void movedNorth() {
		Height = Height+movement;
		System.out.println("Your new Coordinates are : ["+Width+","+Height+"]");
	}
	public void movedEast() {
		Width = Width+movement;
		System.out.println("Your new Coordinates are : ["+Width+","+Height+"]");
		
	}	public void movedSouth() {
		Height = Height-movement;
		System.out.println("Your new Coordinates are : ["+Width+","+Height+"]");
		
	}	public void movedWest() {
		Width = Width-movement;
		System.out.println("Your new Coordinates are : ["+Width+","+Height+"]");
	}
	
	public int getHeight() {
		return Height;
	}
	public int getWidth() {
		return Width;
	}
	
}
