
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidEmail
{
    public static void main(String[] args) throws IOException
    {
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        if(input.contains("@")&&input.contains("."))
        {
            for(int i=0;i<input.length();i++)
            {
                if(!((input.charAt(i)>=65&&input.charAt(i)<=90)||(input.charAt(i)>=97&&input.charAt(i)<=122)||(input.charAt(i)>=48&&input.charAt(i)<=57)||(input.charAt(i)=='.')||(input.charAt(i)=='@')||(input.charAt(i)=='_')))
                {
                    System.out.println("Not Valid");
                    System.exit(0);
                }
            }
            if(!(input.substring(input.indexOf(".")+1).length()>=2))
            {
                System.out.println("Not Valid");
            }
            else if(!(input.substring(0,input.indexOf("@")).length()>=1))
            {
                System.out.println("Not Valid");
            }
            else if(!(input.substring(input.indexOf("@")+1,input.indexOf(".")).length()>=1))
            {
                System.out.println("Not Valid");
            }
            else
            {
                System.out.println("Valid Email");
            }
        }
        else
        {
            System.out.println("Not Valid");
        }
    }
}
