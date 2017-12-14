package Zadanie_1;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanie_liczb {
	public static void main(String[] args) {

		Random r = new Random();
		int a = r.nextInt(99) + 1;
		System.out.println("Zgadnij liczbę wylosowaną przez komputer!");

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj liczbę:");

		while (!scan.hasNextInt()) {
			System.out.println("To musi być liczba. \n Podaj liczbę:");
			scan.nextLine();
		}
		while (true) {
			int b = scan.nextInt();

			if (b < a) {
				System.out.println("Za mało! \n Podaj liczbę:");
				
			} else if (b > a) {
				System.out.println("Za dużo! \n Podaj liczbę:");
				

			} else if (b == a) {
				System.out.println("Zgadłeś, brawo!");
				break;
			}
		}

	}

}
