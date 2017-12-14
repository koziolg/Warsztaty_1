package Zadanie_4;


import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Kostka {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj kod kostki(np. 2D10+10): ");
		String bone = scan.next();
		String kod = bone.toUpperCase();
		Integer y = 0, z = 0, x = 0;
		CharSequence plus = "+";
		CharSequence minus = "-";
		if (kod.indexOf("D") > 0) {
			if (kod.contains(plus)) {
				StringTokenizer strTok = new StringTokenizer(kod, "D+");
				while (strTok.hasMoreTokens()) {
					x = Integer.parseInt(strTok.nextToken());
					y = Integer.parseInt(strTok.nextToken());
					z = Integer.parseInt(strTok.nextToken());

				}

			} else if (kod.contains(minus)) {
				StringTokenizer strTokTwo = new StringTokenizer(kod, "D-");
				while (strTokTwo.hasMoreTokens()) {
					x = Integer.parseInt(strTokTwo.nextToken());
					y = Integer.parseInt(strTokTwo.nextToken());
					z = Integer.parseInt(strTokTwo.nextToken());

				}
			} else {
				StringTokenizer strTokTwo = new StringTokenizer(kod, "D");
				while (strTokTwo.hasMoreTokens()) {
					x = Integer.parseInt(strTokTwo.nextToken());
					y = Integer.parseInt(strTokTwo.nextToken());
				}
			}
		} else if (kod.indexOf("D") < 1) {
			y = Integer.parseInt(kod.substring(1, kod.length()));

		}
	//	System.out.println(x);
	//	System.out.println(y);
	//	System.out.println(z);
		Random r = new Random();
		int ran = r.nextInt(y) + 1;
		int result = 0;
		if (x > 0) {
			result = (x * ran) + z;
		} else {
			result = (ran) + z;
		}
		System.out.println(result);
		scan.close();
	}

}
