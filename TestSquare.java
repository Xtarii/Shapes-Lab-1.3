import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSquare {
    @Test
    public void testSomeSquare() {
        // kollar om arean funkar
        Square rect = new Square(5);

       double area = rect.getArea();
        assertEquals(25, area,"Incorrect area");
    }

    @Test
    public void testSomeOtherSquare() {
        // Kollar så att arean funkar även om de är float värde
        Square rect = new Square(10.1);

        double area = rect.getArea();
        assertEquals(102.00999999999999, area,"Incorrect area");


    }
}
