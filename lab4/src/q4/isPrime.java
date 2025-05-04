package q4;

public class isPrime {
	public static boolean isDivisible(int a, int b) {
		return 0 == (b % a);
	}
	
	public static void printPrimes (int n) {
		int curPrime;
		int numPrimes;
		boolean isPrime;
		int[] primes = new int[100];
		primes[0] = 2;
		numPrimes = 1;
		curPrime = 2;
		while (numPrimes < n) {
			curPrime ++;
			isPrime = true;
			for (int i = 0; i <= numPrimes - 1; i ++) {
				if (isDivisible(primes[i], curPrime)) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes[numPrimes] = curPrime;
				numPrimes ++;
			}
		}
		for (int i = 0; i <= numPrimes - 1; i ++) {
			System.out.println("Prime: " + primes[i]);
		}
	}
}
