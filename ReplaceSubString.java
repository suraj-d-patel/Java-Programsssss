import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceSubString
{
    public static void main(String[] args) throws IOException
    {
        String input =  new BufferedReader(new InputStreamReader(System.in)).readLine();
        String replace =  new BufferedReader(new InputStreamReader(System.in)).readLine();
        while(true)
        {
            int pos = input.indexOf(replace);
            if(pos==-1)
                break;
            input = input.substring(0, pos)+","+input.substring(pos+replace.length());
        }
        System.out.println(input);
    }
}
