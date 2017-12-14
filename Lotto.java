package Zadanie_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj sześć różnych liczb z zakresu 1-49:");
		Integer[] playerTab = new Integer[6];
		Integer g = 50, p = 0;
		Integer l = 0;
		for (int i = 0; i < playerTab.length; i++) {
			while (true) {
				try {
					l = Integer.parseInt(scan.nextLine());
					if (!Arrays.asList(playerTab).contains(l)) {
						if (l < g && l > p) {
							playerTab[i] = l;
							break;
						} else {
							System.out.println("Różne liczby z zakresu 1-49!");
						}
					} else {
						System.out.println("Liczby nie mogą się powtarzać");
					}

				} catch (NumberFormatException nfe) {
					System.out.print("Podaj liczbę: ");
				}
			}

		}
		Arrays.sort(playerTab);
		System.out.println("Wylosowałeś następujące liczby: " + Arrays.toString(playerTab));
		Integer[] tmpArr = new Integer[49];
		for (int i = 1; i < tmpArr.length; i++) {
			tmpArr[i] = i;
		}
		Collections.shuffle(Arrays.asList(tmpArr));
		Integer[] lotto = new Integer[6];
		lotto = Arrays.copyOf(tmpArr, 6);
		Arrays.sort(lotto);
		System.out.println("Wylosowane sześć liczb to " + Arrays.toString(lotto));
		int counter = 0;
		for (int i = 0; i < playerTab.length; i++) {
			if (playerTab[i] == lotto[i]) {
				counter++;
			}
		}
		if(counter == 3){
			System.out.println("Trafiłeś trzy liczby");
		} else if(counter == 4){
			System.out.println("Trafiłeś cztery liczby");
		} else if(counter == 5){
			System.out.println("Trafiłeś pięć liczb");
		} else if(counter == 6){
			System.out.println("Trafiłeś sześć liczb. GRATULACJE!!!");
		}
	}

}
