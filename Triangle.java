public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle() {

    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    double calculateArea() {
        //Assume height to be side of the triangle
        if (base == height) {
            System.out.print("Area of equilateral triangle = ");
            return (Math.sqrt(3) / 4) * Math.pow(height, 2);
        }
        else{
            System.out.print("Area of Non-equilateral triangle = ");
            return ((base*height)/2);
        }
    }


    @Override
    double calculateCircumference() {
        if (base == height) {
            System.out.print("Perimeter of equilateral triangle = ");
            return height * 3;
        }
        else {
            System.out.print("The triangle lengths must be equilateral to calculate perimeter ");
            return 0;
        }

    }
}
