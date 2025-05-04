package assignments.q6;

public class PrimeNumberChecker {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }
        return true; // Number is prime
    }
}
