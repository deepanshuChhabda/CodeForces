package old_archives;

import inputReader.InputReader;
import java.io.PrintWriter;

public class CEhabAndASpecialColoringProblem {
    public boolean[] primes(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        int num = 2;
        while (true) {
            for (int i = 2;; i++) {
                int multiple = num * i;
                if (multiple > n) {
                    break;
                } else {
                    primes[multiple] = false;
                }
            }
            boolean nextNumFound = false;
            for (int i = num + 1; i < n + 1; i++) {
                if (primes[i]) {
                    num = i;
                    nextNumFound = true;
                    break;
                }
            }
            if (!nextNumFound) {
                break;
            }
        }
        return primes;
    }
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int cnt = 1;
        boolean[] prime = primes(n);
        for(int i = 2; i<=n;i++){
            if(prime[i] || i%2!=0)
                out.print((cnt++) + " ");
            else
               out.print(1+" ");
        }
    }
}
