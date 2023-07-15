/*
 * WAP to read the price of an item in decimal form(like 75.95) and print the output in paise(like 7595 paise)
 */
import java.util.*;
public class decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        float n = sc.nextFloat();
        float m = n*100;
        int o = (int)m;
        System.out.println(o+" paise");
        sc.close();
    }
}
