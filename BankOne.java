import java.util.Scanner;
class BankAccount{
            String Name;
            Long Account_Number;
            String Type;
            Float Balance;
        Scanner sc = new Scanner(System.in);
        void GetData(){
            System.out.println("Enter Name of the depositor: ");
            Name = sc.next();
            System.out.println("Enter Account Number: ");
            Account_Number = sc.nextLong();
            System.out.println("Enter Account Type: ");
            Type = sc.next();
            System.out.println("Enter Account Balance: ");
            Balance = sc.nextFloat();

        }
        void Deposit(){
            System.out.println("Enter Amount to be Deposited: ");
            Float d = sc.nextFloat();
            Balance = Balance + d;
            System.out.println("New Balance: "+Balance);
        }
        void Check_Withdraw(){
            System.out.println("Current Balance is: "+ Balance + "Enter amount to be withdrawn: ");
            int w = sc.nextInt();
            if(w > Balance){
                System.out.println("Transaction Failed Insufficient Balance: ");
            }else{
                Balance = Balance - w;
                System.out.println("Transaction Successful, remaining Balance: "+Balance);
            }
        }
        void display(){
            System.out.println("Name of the Depositor: "+Name);
            System.out.println("Balance: "+Balance);
        }
        
    }
public class BankOne {
    public static void main(String[] args) {
     BankAccount Savings = new BankAccount();
     Savings.GetData();
     Savings.Deposit();
     Savings.Check_Withdraw();
     Savings.display();
    }
}
