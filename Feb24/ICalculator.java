package Feb24;

public interface ICalculator {
    default void m1(){
        System.out.println("default is called");
        m3();
    }
    static void m2(){
        System.out.println("static is called");

    }
    private void m3(){
        System.out.println("Private is called");
    }
    void m4();
}
class A implements ICalculator{
    public void m4(){
        System.out.println("Abstract is called");
    }

    public static void main(String[] args) {
        ICalculator.m2();
        A a=new A();
        a.m1();
        a.m4();

    }
}