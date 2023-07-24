import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Inductance: ");
        double L = sc.nextDouble();
        System.out.println("Enter the value of Resistance: ");
        double R = sc.nextDouble();
        double C = 0.01;
        double a,b,d,freq;
        for(int i = 0;i <= 9;i++){
            a = 1/L*C;
            b = (R*R)/4*C*C;
            d = a-b;
            freq = Math.sqrt(d);
            System.out.println("The value of Frequency for C = "+ C + " is "+ freq);
            C = C + 0.01;
        }
        sc.close();
    }
}
