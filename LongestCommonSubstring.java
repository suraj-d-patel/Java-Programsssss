
import java.io.*;

public class LongestCommonSubstring {

    public static void main(String[] args) throws IOException {
        String input1 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        String input2 = new BufferedReader(new InputStreamReader(System.in)).readLine();
        //String input1 = rajurastogi
        //String input2 = my name is rajurastogi
        int maxlen = 0;
        String maxsub = "";
        int length = 0;
        String sub = "";
        String temp;
        for (int i = 0; i < input2.length();) {
            int current = i, pointer = i + 1;

            while (true) {
                temp = input2.substring(current, pointer);
                if (input1.contains(temp)) {
                    length++;
                    i++;
                    pointer++;
                    sub = temp;
                } else {
                    i++;
                    break;
                }
                if (pointer == input2.length() + 1) {
                    break;
                }
            }
            if (maxlen <= length) {
                maxlen = length;
                maxsub = sub;
            }
        }
        System.out.println("Largest Common Substring is : \"" + maxsub + "\" with length of " + maxlen);
    }
}
