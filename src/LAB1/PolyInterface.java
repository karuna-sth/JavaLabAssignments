package LAB1;
interface InterfaceName {
    public void method1();
    void method2();
}

public class PolyInterface implements InterfaceName {    
    @Override
    public void method1(){
        System.out.println("From method 1");
    }
    @Override 
    public void method2(){
        System.out.println("From method 2");
    }
    public static void main(String[] args) {
    	PolyInterface pi = new PolyInterface();
    	pi.method1();
    	pi.method2();
    }
}
