package lab9.upcastinganddowncasting;

public class C extends B {
    public C(){
        super();
        System.out.println("Contructed an instance of C ");
    }

    @Override
    public String toString() {
        return "This is C";
    }
}
