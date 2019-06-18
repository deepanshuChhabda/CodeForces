package old_archives;

import com.sun.xml.internal.ws.encoding.SwACodec;
import inputReader.InputReader;
import java.io.PrintWriter;

public class BMergeIt {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while(t-->0)
        {
            int ro = 0;
            int rt = 0;
            int one = 0;
            int two = 0;
            int size = in.nextInt();
            int cnt = 0;
            int [] arr = new int[size];
            for(int i=0;i<size;i++){
                arr[i] =  in.nextInt();
                if(arr[i]%3==0){
                    cnt++;
                    continue;
                }
                switch(arr[i]){
                    case 1 : one++;break;
                    case 2 : two++;break;
                    default: if(arr[i]+1%3==0)ro++;
                                else rt++;
                }
            }

            if(ro>one){
                cnt+=one;
                one = 0;
            }
            else one-=ro;

            if(rt>two){
                cnt+=two;
                one=0;
            }
            else two-=rt;
            if(one>=two){
                cnt+=two;
                one = one - two;
                cnt += one/3;
            }

            else if(two>=one){
                cnt+=one;
                two = two - one;
                cnt += one/3;
            }
            out.println(cnt);
        }

    }
}
