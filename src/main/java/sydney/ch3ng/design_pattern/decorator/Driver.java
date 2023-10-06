package sydney.ch3ng.design_pattern.decorator;

/**
 * <p></p>
 * Decorator design patterns come under the structural pattern category that allows you to add new features to existing objects without altering the structure. This pattern creates a decorator class that works as a wrapper to the existing class by retaining the class methods’ signatures intact.
 * </p>
 * <p>
 * This pattern uses abstract classes as well as interfaces with composition to implement the wrapper. Mostly, they are used to apply the Single Responsibility Principle (SRP) as the functionalities are divided into classes with distinct concerns. In terms of structure, this pattern is similar to the chain of responsibility pattern.
 * </p>
 */
public class Driver {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape redTriangle
                = new RedColorDecorator(new Triangle());
        Shape redRectangle = new RedColorDecorator(new
                Rectangle());
        // Draw normal triangle
        triangle.draw();
        System.out.println(".........");
        // make the triangle red
        redTriangle.draw();
        System.out.println(".........");
        // make the rectangle red
        redRectangle.draw();
        System.out.println("..........");
    }
}
