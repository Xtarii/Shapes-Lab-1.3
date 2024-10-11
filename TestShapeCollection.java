import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestShapeCollection {
    @Test
    public void testEmptyCollection() {
        // Creates Collection ( Empty )
        ShapeCollection collection = new ShapeCollection();

        boolean isAllCircles = collection.isAllCircles(); // Should be true
        assertTrue(isAllCircles, "isAllCircles should be -> true");
    }

    @Test
    public void testSingleRectangle() {
        ShapeCollection collection = new ShapeCollection();

        // Adds Shapes
        collection.addShape(new Rectangle(10, 10));


        assertFalse(collection.isAllCircles(), "isAllCircles should be -> false");
    }

    @Test
    public void testMultipleShapes() {
        ShapeCollection collection = new ShapeCollection();

        // Shapes
        collection.addShape(new Rectangle(5, 5));
        collection.addShape(new Square(5));
        collection.addShape(new Circle(5));
        collection.addShape(new Circle(5));
        assertFalse(collection.isAllCircles(), "isAllCircles should be -> false");
    }

    @Test
    public void testMultipleCircles() {
        ShapeCollection collection = new ShapeCollection();

        // Circles
        collection.addShape(new Circle(5));
        collection.addShape(new Circle(5));
        collection.addShape(new Circle(5));
        collection.addShape(new Circle(5));
        assertTrue(collection.isAllCircles(), "isAllCircles should be -> true");
    }
}
