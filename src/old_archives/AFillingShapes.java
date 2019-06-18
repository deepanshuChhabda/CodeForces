package old_archives;

import inputReader.InputReader;
import java.io.PrintWriter;

public class AFillingShapes {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        if(n%2!=0)
            out.println(0);
        else{
            out.println((int)Math.pow(2,(n/2)));
        }
    }
}
