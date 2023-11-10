package ownLibrary;

public final class NumTools {
	private NumTools() {

	}

	/**
	 * Determining the number of divisors of a number (beside 1 and the number
	 * itself)
	 * 
	 * @param num
	 * @return
	 */

	public static int numDivisors(int num) {
		int count = 0;
		int max = num / 2;
		for (int i = 2; i <= max; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		return count;
	}

	public static boolean isPrime(int num) {

		if (num < 2)
			return false;
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0)
			return false;
		int max = (int) Math.sqrt(num);
		for (int i = 3; i <= max + 1; i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;

	}

	/**
	 * Greatest common divisor
	 * 
	 * @param a
	 * @param b
	 * @return return the biggest divisor of two numbers
	 */

	public static int gcd(int a, int b) {
		int max;
		int min;

		if (a >= b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		while (max - min > 0) {
			max = max - min;
			if (max < min) {
				int tmp;
				tmp = min;
				min = max;
				max = tmp;
			}
		}
		return min;

	}

	/**
	 * Least common multiple
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int lcm(int a, int b) {

		return (a * b) / gcd(a, b);

	}

	/**
	 * Factorial of a number
	 * 
	 * @param num
	 * @return
	 */
	public static long fact(int num) {
		long result = 1;

		for (int i = 2; i <= num; i++) {
			result *= i;
		}

		return result;
	}

}
