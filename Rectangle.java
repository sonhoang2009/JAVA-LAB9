package lab9.vd2;

public class Rectangle extends Shape {
    private int lenght,width;

    public Rectangle(String color , int lenght , int width){
        super(color);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                "} " + super.toString();
    }

    @Override
    public double getArea() {
        return lenght*width;
    }
}
