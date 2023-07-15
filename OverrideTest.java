package Classes_Objects_Methods;
// program to define method overriding
class Super{
    int x;
    Super(int x){
        this.x = x;
    }
    void display(){   //method defined
        System.out.println("Super x = "+x);
    }
}
class Sub extends Super{
    int y;
    Sub(int x, int y)
    {
        super(x);
        this.y = y;
    }
    void display(){   //method defined again
        System.out.println("Super x ="+x);
        System.out.println("Sub y ="+y);
    }
}
public class OverrideTest {
    public static void main(String[] args) {
        Sub sl = new Sub(100,200);
        sl.display();
    }
    
}
