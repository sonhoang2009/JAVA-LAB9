package lab9.vd2;

public class Shape {
    private String color;

    public Shape (String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public double getArea(){
        System.err.println("Shape unknow Cannot compute are");
        return 0;
    }
}
