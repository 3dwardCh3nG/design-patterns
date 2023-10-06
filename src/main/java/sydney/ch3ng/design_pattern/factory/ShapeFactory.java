package sydney.ch3ng.design_pattern.factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        } else if (type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
