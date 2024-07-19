package OOP_Excercise.Shape;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {   
        
        System.out.print("Enter number of shapes: ");

        int numShapes = Integer.parseInt(scanner.nextLine());
        Shape[] shapesInput = new Shape[numShapes];

        for (int i = 0; i < numShapes;++i) {
            System.out.println("0. Square");
            System.out.println("1. Circle");
            System.out.println("2. Retangle");
            System.out.print("Enter shade needing to create: ");
            int shadeType = Integer.parseInt(scanner.nextLine());
            switch (shadeType) {
                case 0:
                    shapesInput[i] = Square.input();
                    break;
                case 1:
                    shapesInput[i] = Circle.input();
                    break;
                case 2:
                shapesInput[i] = Retangle.input();
                default:
                    break;
            }
        }
        System.out.println("Shape was entered:");
        for (int i = 0; i < numShapes; ++i) {
            System.out.printf("%s Premimeter: %.2f Area: %.2f\n", 
                shapesInput[i].getClass().getSimpleName(),
                shapesInput[i].calcPremimeter(),
                shapesInput[i].calcArea());
        }

        scanner.close();
    }
}
