package _05_for_loops._3_bananas_4eva.bananas_4eva;

import javax.swing.JOptionPane;

public class bananas_4eva {
  public static void main(String[] args) {
    int currentBananaNumber = 0;
    int wantedBananaNumber = 1000;

    for(currentBananaNumber = 0; currentBananaNumber <= wantedBananaNumber; currentBananaNumber+=1) {
      System.out.print("Banana");
    }
  }
}