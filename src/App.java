import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("The area of the circle of radius " + radius + " is " + ComputeArea(radius));
        scanner.close();
    }

    public static Double ComputeArea(double radius) {
        // double area = radius * radius * 3.14159;
        // you can use the sqaure function from the Math class
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
