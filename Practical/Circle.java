abstract class Circle extends GeometricObject {
    private double radius;
    private static double PI = 3.14;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    double getArea() {
        return radius * radius * PI;
    }

    double getPerimeter() {
        return getDiameter() * PI;
    }
}
