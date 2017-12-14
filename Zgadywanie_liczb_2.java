package Zadanie_3;

import java.util.Scanner;

public class Zgadywanie_liczb_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Pomyśl liczbę od 0 do 1000, a ja zgadnę w max 10 próbach.");
		int min = 0, max = 1000;
		int counter = 0;
		while (true) {
			int guess = ((max - min) / 2) + min;
			System.out.println("Zgaduję: " + guess + "\nMożliwe odpowiedzi \"za dużo\", \"za mało\", \"zgadłeś\". ");

			String answer = scan.nextLine();

			if (answer.equals("za dużo")) {
				max = guess;
			} else if (answer.equals("za mało")) {
				counter++;
				min = guess;
			} else if (answer.equals("zgadłeś")) {
				System.out.println("Wygrałem");
				break;
			} else if ((!(answer.equals("zgadłeś") && answer.equals("za mało")) && !answer.equals("za dużo"))) {
				System.out.println("Udziel poprawnej odpowiedzi");
			}
			if (counter == 2) {
				System.out.println("Nie oszukuj");
			}
		}
	}

}
