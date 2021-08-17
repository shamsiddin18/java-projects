import java.io.BufferedInputStream;
import java.util.Scanner;

public class Sheets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int a = sc.nextInt();
        while (a-- != 0)
        {
            String aString = sc.next();
            if (aString.charAt(0) == 'R')
            {
                int c = aString.lastIndexOf('C');
                int cow = Integer.parseInt(aString.substring(c + 1, aString.length()));
                int row = Integer.parseInt(aString.substring(1, c));
                String cString = "";
                while (cow > 26)
                {
                    int d = cow % 26;
                    char x = (char) ('A' + d - 1);
                    cString = x + cString;
                    cow = cow / 26;
                }
                int d = cow % 26;
                char x = (char) ('A' + d - 1);
                cString = x + cString;
                System.out.println(cString + row);
            } else
            {
                int r = 0;
                for (int i = 0; i < aString.length(); i++) { if (aString.charAt(i) <= '9' && aString.charAt(i) >= '0')
                {
                    r = i;
                    break;
                }
                }
                int row = Integer.parseInt(aString.substring(r, aString.length()));
                String bstring = aString.substring(0, r);// BC
                int sum = 0;
                for (int i = 0; i < bstring.length(); i++)
                {
                    char c = bstring.charAt(i);
                    int d = c - 'A' + 1;
                    sum = sum * 26 + d;
                }
                System.out.println("R" + row + "C" + sum);
            }
        }
        sc.close();
    }
}