class Rectangle {
    int length,width;
    Rectangle(int x, int y)//Defining Constructor
    {
        length = x;
        width = y;
    }
    int rectArea(){
        return(length*width);
    }
}
public class RectangleArea
{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(15, 10); // Calling constructor rect1
        int area1 = rect1.rectArea();
        System.out.println("Area = "+area1);
    }
}
