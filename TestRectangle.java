import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRectangle {
    @Test
    public void testSomeRectangle() {
        // Test Rectangle area
        Rectangle rect = new Rectangle(10, 10);

        double area = rect.getArea(); // Should be 100
        assertEquals(area, 100, "Area should be 100");
    }

    @Test
    public void testSomeOtherRectangle() {
        Rectangle rect = new Rectangle(25, 10);
        double area = rect.getArea(); // Should be 25 * 10 = 250
        assertEquals(area, 25 * 10, "Area should be 25 * 10 -> 250");
    }
}
