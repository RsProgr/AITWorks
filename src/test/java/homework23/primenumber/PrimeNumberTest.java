package homework23.primenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeNumberTest {
    @Test
    public void testIsPrime() {
        assertTrue(PrimeNumber.isPrime(2));
        assertTrue(PrimeNumber.isPrime(3));
        assertTrue(PrimeNumber.isPrime(5));
        assertTrue(PrimeNumber.isPrime(7));

        assertFalse(PrimeNumber.isPrime(4));
        assertFalse(PrimeNumber.isPrime(6));
        assertFalse(PrimeNumber.isPrime(8));
        assertFalse(PrimeNumber.isPrime(9));
    }
}