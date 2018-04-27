import java.util.Scanner;

public class Move {

	Treasure theTreasure = new Treasure(); //treasure object 
	Trap theTrap = new Trap();
	Grid myGrid = new Grid();
	Scanner myScanner = new Scanner(System.in); // creating scanner
	textOptions myOptions = new textOptions();
	
	public void MoveOption() {
		myOptions.moveOptions();
		
		String movementChoice = null;
		while (movementChoice==null){
		int UserChoice = myScanner.nextInt(); // gets user input
		
			switch(UserChoice) {
			case 1:
				System.out.println("You have chosen North!");
				movementChoice = "north";
				myGrid.movedNorth();
			break;
			
			case 2:
				System.out.println("You have chosen East!");
				movementChoice = "east";
				myGrid.movedEast();
			break;
			
			case 3:
				System.out.println("You have chosen South!");
				movementChoice = "south";
				myGrid.movedSouth();
			break;
			
			case 4:
				System.out.println("You have chosen West!");
				movementChoice = "west";
				myGrid.movedWest();
			break;
			
			default:
				System.out.println("Please enter a valid option");
				
			}
		}
	
		for(int i =0; i<Difficulty.Events;i++) {
			
			for (Event E: Event.Events)
			{
				if(E.isTrue()) {
					return;
				}
			}
		}
		if(theTreasure.isTreasure()) {
			myScanner.close();
			return;
		}
		else
			System.out.println("Magic Compass: You are "+theTreasure.distanceFromTreasure()+"m from the treasure");
	}
}
