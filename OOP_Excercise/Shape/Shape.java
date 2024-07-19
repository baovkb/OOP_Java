package OOP_Excercise.Shape;

public abstract class Shape {
    public abstract double calcPremimeter();
    public abstract double calcArea();
}

class Retangle extends Shape{
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    Retangle (Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public static Retangle input() {
        Point p1 = Point.input();
        Point p2 = Point.input();
        Point p3 = Point.input();
        Point p4 = Point.input();

        return new Retangle(p1, p2, p3, p4);
    }

    @Override
    public double calcPremimeter() {
        return (p1.distanceTo(p2) + p1.distanceTo(p3))*2;
    }

    @Override
    public double calcArea() {
        return p1.distanceTo(p2) * p1.distanceTo(p3);
    }
}

class Square extends Retangle{
    Square (Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    public static Square input() {
        Point p1 = Point.input();
        Point p2 = Point.input();
        Point p3 = Point.input();
        Point p4 = Point.input();

        return new Square(p1, p2, p3, p4);
    }
}

class Circle extends Shape {
    private Point center;
    private double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public static Circle input() {
        Point center = Point.input();
        System.out.print("Enter radius: ");
        double radius = Double.parseDouble(Main.scanner.nextLine());

        return new Circle(center, radius);
    }

    public boolean containsPoint(Point other) {
        return center.distanceTo(other) <= radius;
    }

    public double calcDiameter() {
        return radius*2;
    }

    @Override
    public double calcPremimeter() {
        return calcDiameter()*Math.PI;
    }

    @Override
    public double calcArea() {
        return radius*radius*Math.PI;
    }
}