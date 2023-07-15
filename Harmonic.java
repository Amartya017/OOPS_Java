/*
 * WAP to determine the sum of the following harmonic series for a given value of user input n.
 * 1 + 1/2 + 1/3 + .. + 1/n
 */
import java.util.*;
public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int count = 1;
        float add = 0;
        for(int i = 2; i <= n; i++)
            add = add + (float)1/i;
        float sum = count + add;
        System.out.println(sum);
        sc.close();
    }
}
