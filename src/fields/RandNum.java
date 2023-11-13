package fields;

import java.util.Random;
import java.util.Scanner;

public class RandNum {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Generovani nahodnych cisel od 0 do rozsah -1");
		System.out.println("Zadej koncovy rozsah a pocet nahodnych cisel.");
		int rozsah = sc.nextInt();
		int pocet = sc.nextInt();

		int[] arrRand = new int[pocet];
		int[] randCount = new int[rozsah];

		Random rand = new Random();

		for (int i = 0; i < pocet; i++) {
			arrRand[i] = Math.abs(rand.nextInt() % rozsah);
			randCount[arrRand[i]]++;
		}

		for (int i : arrRand) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : randCount) {
			System.out.print(i + " ");
		}
		int max = -Integer.MAX_VALUE;
		int min = Integer.MAX_VALUE;
		int valueMax = -Integer.MAX_VALUE;
		int valueMin = Integer.MAX_VALUE;
		for (int i = 0; i < rozsah; i++) {
			if (randCount[i] > valueMax) {
				max = i;
				valueMax = randCount[i];
			}
			if (randCount[i] < valueMin) {
				min = i;
				valueMin = randCount[i];
			}
		}
		System.out.println();
		System.out.printf("max: %d (%d times)\n", max, valueMax);
		System.out.printf("min: %d (%d times)\n", min, valueMin);

	}

}
