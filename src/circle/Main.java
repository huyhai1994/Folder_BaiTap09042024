package circle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 20);
        Circle circle2 = new Circle(2, 30);
        System.out.println("circle number was created: " + Circle.objectNumber);
        System.out.println("Area of Circle ID: " + circle1.getId() +
                " is " + circle1.getAreaOfCircle());
        System.out.println("Area of Circle ID: " + circle2.getId() +
                " is " + circle2.getAreaOfCircle());
        System.out.println("List of Area: " + Arrays.toString(Circle.areaArray));
        System.out.println("Maximum of radius: " + Circle.maxRadius);
    }
}
