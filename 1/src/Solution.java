import java.util.Scanner;
public class Solution {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        long m = input.nextLong();

        long n = input.nextLong();
        long a = input.nextLong();
        System.out.println(((m+a-1)/a)*((n+a-1)/a));
    }
}