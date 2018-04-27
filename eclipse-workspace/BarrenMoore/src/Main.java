
public class Main {

	static boolean End;
	static boolean foundEvent;
	static int count;
	
	public static void main(String[] args) {

		Difficulty setDifficulty = new Difficulty();
		setDifficulty.setDifficulty();
		
		Player myPlayer = new Player();
		myPlayer.startGame();
		
		Grid GameGrid = new Grid();
		GameGrid.setStartingPosition();
		
		while(!End) {
			Move playerMove = new Move();
			playerMove.MoveOption();
			count++;
		}
		System.out.println("You managed "+ count + " Moves!");
		System.out.println("Thanks for playing !!!!");
		System.out.println("------------------------------------------------------------------------------------------------------");

	}

}
