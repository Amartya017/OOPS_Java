public class Displaying {
    public static void main(String[] args) {
        System.out.println("Screen Display");
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println("\n");
        }
        System.out.println("Screen Display Done");
    }
}
