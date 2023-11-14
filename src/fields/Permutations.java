package fields;
import java.util.Random;
import java.util.Scanner;

public class Permutations {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Zadej delku pole: ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		// first option
		Random num = new Random();
		int numAdd = Math.abs(num.nextInt() % len) + 1;
		for (int i = 0; i < len; i++) {
			arr[i] = (numAdd++) % len;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
			
		
		
	}

}
