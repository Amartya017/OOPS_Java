class One
{
    public void method(){
        System.out.println("One");
    }
}
class two extends One{
    public void method(){
        System.out.println("two");
    }
}
class dyn_dis{
    public static void main(String[] args) {
        One A = new two(); // Two's object reference assigned to one type reference
        A.method();  // Two's version of method will be called at runtime
    }
}