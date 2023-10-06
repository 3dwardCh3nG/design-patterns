package sydney.ch3ng.design_pattern.builder;

public class Director {
    public void construct(Builder builder) {
        // use the builder to construct the complex object
        builder.getResult().setStatus("constructed");
    }
}
