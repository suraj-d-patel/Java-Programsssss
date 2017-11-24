import java.io.*;

public class AlphabetCheck
{
    public static void main(String[] args) throws IOException
    {
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String words[] = input.split(" ");
        for (String word : words)
        { 
            if(word.length()==0)
                break;
            int ascii=word.charAt(0);
            int j;
            for (j=1; j < word.length(); j++)
            {
                if (ascii > word.charAt(j))
                {
                    break;
                }
                else
                {
                    ascii = word.charAt(j);
                }
            }
            if (j == word.length())
            {
                System.out.println(word);
            }
        }
    }
}
