package _05_for_loops._2_badgers;

import javax.swing.JOptionPane;

public class Badgers {
	public static void main(String[] args) {
	
		String Badger = "Badger, ";
		String Mushroom = "Mushroom, ";
		String Snake = "A Snake!!!";
		int currentBadgerNumber = 0;
		int wantedBadgerNumber = 12;
		int currentMushroomNumber = 0;
		int wantedMushroomNumber = 2;
		
		for(currentBadgerNumber = 0; currentBadgerNumber <= wantedBadgerNumber; currentBadgerNumber+=1) {
			System.out.print(Badger);
		}
		for(currentMushroomNumber = 0; currentMushroomNumber <= wantedMushroomNumber; currentMushroomNumber+=1) {
			System.out.print(Mushroom);
		}
		for(currentBadgerNumber = 0; currentBadgerNumber <= wantedBadgerNumber; currentBadgerNumber+=1) {
			System.out.print(Badger);
		}
		for(currentMushroomNumber = 0; currentMushroomNumber <= wantedMushroomNumber; currentMushroomNumber+=1) {
			System.out.print(Mushroom);
		}
		System.out.print(Snake);
	}
}
