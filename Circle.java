public class Circle extends Shape{
    private double radius;

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

    @Override
    double calculateArea() {
        return 3.14*Math.pow(radius,2);

    }

    @Override
    double calculateCircumference() {
        return 2*3.14*radius;
    }
}
