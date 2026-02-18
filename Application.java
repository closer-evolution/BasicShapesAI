import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args)
    {
        ShapeFactory factory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("square"));

        for(Shape s: shapes) {
            s.draw();
        }

        // Example of using the Emphasis decorator
        System.out.println("\nShapes with Emphasis:");
        Shape emphasizedCircle = new Emphasis(factory.getShape("circle"));
        emphasizedCircle.draw();

        System.out.println();
        Shape emphasizedSquare = new Emphasis(factory.getShape("square"));
        emphasizedSquare.draw();
    }
}
