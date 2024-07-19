package OOP_Excercise.Shape;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //getter, setter
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceTo(Point other) {
        double deltaX = other.x - this.x;
        double deltaY = other.y - this.y;

        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }

    public static Point input() {
        System.out.print("Enter x: ");
        double inputX = Double.parseDouble(Main.scanner.nextLine());
        System.out.print("Enter y: ");
        double inputY = Double.parseDouble(Main.scanner.nextLine());

        return new Point(inputX, inputY);
    }
}
