package sydney.ch3ng.design_pattern.factory;

/**
 * Factory design pattern comes under the Creational Design Patterns category. Herein, the objects get created without exposing the creation logic to the client. The objects are referred to the common interface.
 */
public class Driver {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //get Triangle object and call draw ( )
        Shape triangle = shapeFactory.getShape("Triangle");
        triangle.draw();
        //get Rectangle object and call draw ( )
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        //get Square object and call draw ( )
        Shape square = shapeFactory.getShape("Square");
        square.draw();
    }
}
