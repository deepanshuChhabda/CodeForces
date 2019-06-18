package old_archives;

import inputReader.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class BPlusFromPicture {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int h = in.nextInt();
        int w = in.nextInt();
        if(w<=2 || h<=2) {
            out.println("NO");
            return;
        }
        char[][] arr = new char[h][w];
        for(int i =0;i<h;i++){
            arr[i] = in.next().toCharArray();
        }
        //find plus
        for(int i=1;i<h-1;i++){
            for(int j=1;j<w-1;j++){
                if(arr[i][j]=='*' && arr[i+1][j]=='*' && arr[i-1][j]=='*' && arr[i][j+1]=='*' && arr[i][j-1]=='*'){
                    int l=j-1,r=j+1,u=i-1,d=i+1;
                    while(r<w){ if(arr[i][r]=='.')break; r++;}//arr[i][r-1]
                    while(l>=0){ if(arr[i][l]=='.')break; l--;}//arr[i][l+1]
                    while(d<h){ if(arr[d][j]=='.')break; d++;}//arr[d-1][j]
                    while(u>=0){ if(arr[u][j]=='.')break; u--;}//arr[u+1][j]
                    for(int i2=0;i2<h;i2++)
                        for(int j2=0;j2<w;j2++){
                            if(arr[i2][j2]=='*' && ((i2<u+1 || i2>d-1) || (j2>r-1 || j2<l+1))) {
                                out.println("NO");
                                return;
                            }
                        }
                }
            }
        }
        out.println("YES");
    }
}
