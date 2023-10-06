package sydney.ch3ng.design_pattern.decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape shapeDecorated;

    public ShapeDecorator(Shape shapeDecorated) {
        this.shapeDecorated = shapeDecorated;
    }

    public void draw() {
        shapeDecorated.draw();
    }
}
