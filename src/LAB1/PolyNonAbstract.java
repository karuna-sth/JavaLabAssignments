package LAB1;
class Demo {
    public void gift(){
        System.out.println("This is Demo Class");
    }
}
public class PolyNonAbstract extends Demo {
    final int a=10;
    @Override
    public void  gift(){
        System.out.println("This is PolyNonAbstract");
    }
    public static void main(String[] args) {
        final int B;//b become constant
        //once assigned any value, that variable become constant
        B=20;
        PolyNonAbstract pna = new PolyNonAbstract();
        pna.gift();
        Demo s = new Demo();
        Demo f = new PolyNonAbstract();
        f.gift();
        s.gift();
    }
}
