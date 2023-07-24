import java.util.Scanner;
public class Economics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Demand Rate: ");
        int DR = sc.nextInt();
        System.out.println("Enter Setup Cost:");
        int SC = sc.nextInt();
        System.out.println("Enter holding cost per unit time: ");
        int HC = sc.nextInt();
        double EOQ = (2*DR*SC)/HC;
        double ans_1 = Math.sqrt(EOQ);
        double TBO = (2*SC)/(DR*HC);
        double ans_2 = Math.sqrt(TBO);
        sc.close();
        System.out.println("EOQ is: "+ ans_1 + "and TBO is: " + ans_2);
        
    }
}
