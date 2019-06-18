package old_archives;

import inputReader.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class BEhabIsAnOddPerson {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n  = in.nextInt();
        int cnt = 0;
        int arr [] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
            if(arr[i]%2==0)
                cnt++;
        }
        if(cnt!=n && cnt !=0)
            Arrays.sort(arr);

        for(int i=0;i<n;i++)
            out.print(arr[i]+" ");

    }
}
