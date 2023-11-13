package fields;

import java.util.Scanner;

public class VycetPlatidel {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] p = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		boolean end = true;
		int[] count = new int [12];
		do {
			System.out.println("Zadej castku: ");
			int n = sc.nextInt();
			int num = n;
			if (num < 0) {
				end = false;
				break;
			}
			int index = 0;
			while (num != 0) {
				int tmp = 0;
				tmp = num / p[index];
				num -= tmp * p[index];
	
				count[index] = tmp;
				index++;
			}
			int max = p.length;
			for (int i = 0; i < max; i++) {
				if (count[i] != 0) {				
					System.out.printf("%d x %d\n", p[i], count[i]);
				}
			}
			for (int i = 0; i < max; i++) {
				count[i] = 0;
			}
			
		}while(end);
	}

}
