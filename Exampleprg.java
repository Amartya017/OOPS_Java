package Classes_Objects_Methods;

public class Exampleprg {
    static void Example(String...person){
        for(String name : person){
            System.out.println("Hello "+name);
        }
    }
public static void main(String[] args) {
    Example("John", "David", "Suhel");
 }
}
