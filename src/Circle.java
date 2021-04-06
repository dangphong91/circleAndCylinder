public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return this.radius* this.radius* Math.PI;
    }
    @Override
    public String toString() {
        return "A Circle with color of "
                + getColor()
                + " and radius: " + getRadius()
                + " Area of circle: " + getArea();
    }
//    public static void main(String[] args) {
//        Circle circle = new Circle(3.5, "red");
//        System.out.println(circle.toString());
//    }
}
