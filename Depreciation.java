// Program to calculate Yearly Depreciation of the Item
import java.util.Scanner;
public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Purchase Price: ");
        float Purchase_Price = sc.nextFloat();
        System.out.println("Enter the Salvage Value: ");
        float Salvage_Value = sc.nextFloat();
        System.out.println("Enter the Years of Service: ");
        float Years_of_Service = sc.nextFloat();
        float Depreciation = (Purchase_Price - Salvage_Value)/Years_of_Service;
        System.out.println("The Yearly Depreciation of the Item is: "+Depreciation);
        sc.close();
    }
}
