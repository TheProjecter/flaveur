package primes;

import java.util.List;

public interface IPrimesFinder {

    /**
     * Finds all prime numbers, strictly less then given value
     * @param max - prime number limit
     * @return collection of prime numbers
     */
    List<Integer> findPrimes(int max);

}
