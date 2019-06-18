package old_archives;

import inputReader.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class AEhabFailsToBeThanos {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int sumn = 0;
        int sum2n  = 0;

        int arr[] = new int[2*n];
        for(int i = 0;i<2*n;i++)
            arr[i] = in.nextInt();

        Arrays.sort(arr);
        for(int i = 0;i<2*n;i++){
            sum2n+=arr[i];
            if(i<n)
                sumn+=arr[i];
        }
        if(sum2n-sumn == sumn)
            out.println(-1);
        else
            for(int i = 0;i<2*n;i++)
                out.print(arr[i]+" ");

    }
}
