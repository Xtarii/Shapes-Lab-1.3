import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTriangle {
    @Test
    public void testSomeTriangle() {
        Triangle triangle = new Triangle(5, 5);
        double area = triangle.getArea(); // Should be (5 * 5) / 2 = 12.5
        assertEquals(12.5, area, "Area should be 12.5");
    }

    @Test
    public void testSomeOtherTriangle() {
        Triangle triangle = new Triangle(12, 45);
        double area = triangle.getArea(); // (12 * 45) / 2
        assertEquals((double) (12 * 45) / 2, area, "Area should be 270");
    }
}
