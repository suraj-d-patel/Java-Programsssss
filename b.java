import java.io.*;
import java.util.*;
public class b {
    public static void main(String[] args)throws IOException {
        String c;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter the string");
        String s=br.readLine();
        //s= s.trim();
        StringTokenizer st;
        st = new StringTokenizer(s);
            int n = st.countTokens();
            for (int i = 0; i <=n; i++) {
            c = st.nextToken();
            StringBuilder sb = new StringBuilder(c);
            c=sb.reverse().toString();
            System.out.print(c); } 
    }
}
