import java.util.*;
public class Reading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intnumber = 0;
        float floatNumber = 0.0f;
        try{
            System.out.println("Enter an Integer: ");
            intnumber = sc.nextInt();
            System.out.println("Enter a float number: ");
            floatNumber = sc.nextFloat();
        }
        catch(Exception e){ }
        System.out.println("Int number: "+ intnumber);
        System.out.println("Float number: "+ floatNumber);
        sc.close();

    }
}
