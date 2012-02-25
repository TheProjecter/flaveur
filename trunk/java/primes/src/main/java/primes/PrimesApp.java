package primes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class PrimesApp {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrimesFinder primesFinder = new PrimesFinder();
        System.out.print("Enter the number: ");
        String userInput = reader.readLine();
        int number = Integer.parseInt(userInput);

        List<Integer> primes = primesFinder.findPrimes(number);

        if (! primes.isEmpty()) {
            System.out.print("Primes: ");
            for (int i = 0; i < primes.size() - 1; i++) {
                System.out.print(primes.get(i) + ", ");
            }
            System.out.print(primes.get(primes.size() - 1) + "\n");
        } else {
            System.out.print("No primes found");
        }
    }
}

