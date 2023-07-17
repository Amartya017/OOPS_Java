class Mathoperation{
    static float mul(float x, float y){
        return (x*y);
    }
    static float divide(float x,float y){
        return(x/y);
    }
}

public class MathApplication {
    public static void main(String[] args) {
        float a = Mathoperation.mul(4.0F,5.0F);
        float b = Mathoperation.divide(a,2.0F);
        System.out.println("b ="+b);
    }
}
