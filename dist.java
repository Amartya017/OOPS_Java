import java.util.Scanner;
public class dist {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Initial Velocity:");
    float u = sc.nextFloat();
    System.out.println("Enter the acceleration: ");
    float a = sc.nextFloat();
    System.out.println("Enter the Time period: ");
    float t = sc.nextFloat();
    float distance = u*t + ((a*t*t)/2);
    System.out.println("The distance travelled in meters: "+ distance);
    sc.close();
    }
}
