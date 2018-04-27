import java.util.Scanner;


public class Difficulty {
	static int Events;
	
	Scanner myScanner = new Scanner(System.in);
	public void setDifficulty() {
		boolean chosen = false;
		
		
		System.out.println("Please choose a difficulty! (1,2,3,4)");
		System.out.println("\t1. Easy");
		System.out.println("\t2. Medium");
		System.out.println("\t3. Hard");
		System.out.println("\t4. Insane");
		
		while(!chosen) {
			int i = myScanner.nextInt();
			
			switch(i) {
			case 1:
				System.out.println("\tYou have chosen Easy!");
				Grid.GRIDSIZE=10;
				Events =1;
				chosen =true;
				break;
				
			case 2:
				System.out.println("\tYou have chosen Medium!");
				Grid.GRIDSIZE=15;
				Events = 5;
				chosen =true;
				break;
				
			case 3:
				System.out.println("\tYou have chosen hard !!");
				Grid.GRIDSIZE =20;
				Events = 10;
				chosen =true;
				break;
				
			case 4:
				System.out.println("\tGood Luck!!!!!!!");
				Grid.GRIDSIZE=100;
				Events = 100;
				chosen =true;
				break;
				
				default:
					System.out.println("Please enter a valid option");
			}
		}
	}
}
