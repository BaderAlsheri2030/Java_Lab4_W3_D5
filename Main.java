
public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(3.6465);
        System.out.println("Area of circle = "+String.format("%.2f",c1.calculateArea()));
        System.out.println("Circumference of circle = "+String.format("%.2f",c1.calculateCircumference()));
        System.out.println("Radius of circle = "+String.format("%.2f",c1.getRadius()));
        System.out.println("----------");

        Rectangle r1 = new Rectangle(5.765,5.91);
        System.out.println("Area of rectangle = "+String.format("%.2f",r1.calculateArea()));
        System.out.println("Perimeter of rectangle = "+String.format("%.2f",r1.calculateCircumference()));
        System.out.println("height: "+r1.getHeight()+" width: "+r1.getWidth());
        System.out.println("-----------------------");

        Triangle t2 = new Triangle(4,5);
        System.out.println(String.format("%.2f",t2.calculateArea()));
        System.out.println(String.format("%.2f",t2.calculateCircumference()));
        System.out.println("Height: "+t2.getHeight()+" base: "+t2.getBase());

        System.out.println("-----------------------");

        Triangle t1 = new Triangle(3,3);
        System.out.println(String.format("%.2f",t1.calculateArea()));
        System.out.println(String.format("%.2f",t1.calculateCircumference()));
        System.out.println("Height: "+t1.getHeight()+" base: "+t1.getBase());






    }
}