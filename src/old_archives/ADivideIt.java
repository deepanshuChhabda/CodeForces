package old_archives;

import inputReader.InputReader;
import java.io.PrintWriter;

public class ADivideIt {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int q = in.nextInt();
        while(q-->0){
            long n = in.nextLong();
            long count = 0;
            while(true){

                if( n%2 == 0){
                    n=n/2;
                    count++;
                }

                if(n%3==0){
                    n=(2*n)/3;
                    count++;
                }

                if(n%5==0){
                    n=(4*n)/5;
                    count++;
                }

                if(n%2!=0 && n%3!=0 && n%5!=0) break;
                   //continue;
            }
            if(n==1){
                out.println(count);
                count = 0;
            }
            else{
                out.println(-1);
                count = 0;
            }
        }
    }
}
