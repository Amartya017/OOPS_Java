package Classes_Objects_Methods;

class Rectangle{
    int length,width; //Declaration of Variables
    void getdata(int x, int y){  // Declaration of Method
        length = x;
        width = y;
    }
    int rectArea () {  // Declaration of Another Method
        int area = length * width;
        return(area);
    }
}

public class RectArea {     // Class with main Method
    public static void main(String args[]) {
        int area1, area2;
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.length = 15; rect1.width = 10;
        rect2.getdata(20,12);
        area1 = rect1.length*rect1.width;
        area2 = rect2.rectArea();
        System.out.println("Area1 = "+ area1);
        System.out.println("Area2 = "+ area2);
    }
}
