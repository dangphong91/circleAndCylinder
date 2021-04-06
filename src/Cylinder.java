public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*this.height;
    }
    @Override
    public double getArea() {
        return 2*getRadius()*Math.PI*this.height;
    }
    @Override
    public String toString() {
        return "A Cylinder with color of "
                + getColor()
                + " and radius: " + getRadius()
                + " Surrounding area of cylinder: " + getArea()
                + " Volume of culinder: " + getVolume();
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3.5, "blue", 5);
        System.out.println(cylinder.toString());
    }
}
