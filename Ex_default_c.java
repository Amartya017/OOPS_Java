package Classes_Objects_Methods;

class perimeter{
    int length,breadth;
    perimeter(){       //default constructor
        length = 0;
        breadth = 0;
    }
    perimeter(int x, int y){
        length = x;
        breadth = y;
    }
    void cal_perimeter(){
        int peri;
        peri = 2*(length+breadth);
        System.out.println("\nThe perimeter of Rectangle is: "+peri);
    }
}

public class Ex_default_c {
    public static void main(String[] args) {
        perimeter p1 = new perimeter();
        perimeter p2 = new perimeter(12,20);
        p1.cal_perimeter();
        p2.cal_perimeter();
    }
}
