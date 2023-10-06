package sydney.ch3ng.design_pattern.factory;

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
