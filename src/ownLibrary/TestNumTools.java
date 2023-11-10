package ownLibrary;

public class TestNumTools {

	public static void main(String[] args) {
		System.out.println("Testing NumTools library");
	
		// factorial
		long a = NumTools.fact(6);
		System.out.println(a);
	
		// isPrime
		int b = 13;
		System.out.println(NumTools.isPrime(b));
		int c = 99;
		System.out.println(NumTools.isPrime(c));
	
		// num of divisors
		int d = 100;
		System.out.println(NumTools.numDivisors(d));
		int e = 18;
		System.out.println(NumTools.numDivisors(e));
		
		// gcd 
		int f = 20;
		int g = 30;
		System.out.print("Gcd: ");
		System.out.println(NumTools.gcd(f,g));
		
		// lcm
		f = 20;
		g = 30;
		System.out.print("Lcm: ");
		System.out.println(NumTools.lcm(f,g));
	}
}
