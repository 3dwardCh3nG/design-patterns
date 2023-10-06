package sydney.ch3ng.design_pattern.builder;

/**
 * <p>
 * The Builder design pattern is a creational design pattern that allows for the step-by-step construction of complex objects using a specific construction process. It separates the construction of an object from its representation so that the same construction process can create different representations.
 * </p>
 * <p>
 * The Builder pattern is useful when you want to create complex objects, but the construction process for these objects is relatively simple. It allows you to create the object step by step and provides a way to retrieve the final object once it has been constructed.
 * </p>
 */
public class BuilderExample {
    public static void main(String[] args) {
        // create the director
        Director director = new Director();

        // create the builder
        Builder builder = new ConcreteBuilder();

        System.out.println(builder.getResult().getStatus());

        // construct the complex object
        director.construct(builder);

        // retrieve the finished product
        ComplexObject complexObject = builder.getResult();

        System.out.println(complexObject.getStatus());
    }
}
