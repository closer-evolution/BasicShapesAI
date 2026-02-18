public class Emphasis extends ShapeDecorator {
    public Emphasis(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        System.out.println("***");
        decoratedShape.draw();
        System.out.println("***");
    }
}
