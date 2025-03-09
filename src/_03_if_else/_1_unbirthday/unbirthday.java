package _03_if_else._1_unbirthday;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class unbirthday {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("When is your birthday?");
		ZoneId zonedId = ZoneId.of( "America/Montreal" );
		LocalDate today = LocalDate.now( zonedId );
		String date = ("3/9");
			if(input.equals(date)) {
					System.out.println("Happy Birthday!");
					}
			else {
				System.out.println("Happy Unbirthday!");
			}
	}

}
