import java.util.Scanner;
public class row{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i = 0; i <= 2;i++){  // This code writes a program that will read a real number
            System.out.print(n+1);   // and print smallest integer not less than the number, the given
            System.out.print("\t");//number and the largest integer not greater than the number in one
            n--;                     //in one line     
        }sc.close();
    }
}