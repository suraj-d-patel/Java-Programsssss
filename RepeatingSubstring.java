
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatingSubstring
{
    public static void main(String[] args) throws IOException
    {
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int count = 0;
        String maxsubstr = "";
        for(int i=0;i<input.length();i++)
        {
            String temp = input.substring(i);
            for(int j=i+1;j<temp.length();j++)
            {
                String s = temp.substring(0,j);
                System.out.println(s);
                int pos = j,localcount = 0;
                while(true)
                {
                    pos = temp.indexOf(s, pos+1);
                    if(pos!=-1)
                    {
                        localcount++;
                        System.out.println("Found at "+pos);
                    }
                    else
                    {
                        break;
                    }
                }
                if(localcount>=count)
                {
                    count = localcount;
                    maxsubstr = s; 
                }
            }
        }
        if(count==0)
        {
            System.out.println("No Repeating String found");
        }
        else
        System.out.println("largest repeating substring is: "+maxsubstr +" with count of "+count+" times");
    }
}