package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountSemiprimes {
    public List<Integer> primes(int N) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++)
            if (checkPrime(i))
                primes.add(i);
        return primes;
    }

    public List<Integer> semiprimes(List<Integer> primes) {
        List<Integer> semi = new ArrayList<>();
        for (int i = 0; i < primes.size(); i++)
            for (int j = i; j < primes.size(); j++)
                semi.add(primes.get(i) * primes.get(j));
        return semi;
    }

    public boolean checkPrime(int N) {
        for (int i = 2; i*i <= N; i++)
            if (N % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        CountSemiprimes cs = new CountSemiprimes();
        List<Integer> primes = cs.primes(13);
        System.out.println(primes);
        List<Integer> semi = cs.semiprimes(primes);
        Collections.sort(semi);
        System.out.println(semi);
    }
}
