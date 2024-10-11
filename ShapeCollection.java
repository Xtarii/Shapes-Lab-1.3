import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {
    private List<Shape2D> shapes = new ArrayList<>();

    public void addShape(Shape2D shape) {
        shapes.add(shape);
    }

    public int getNumberOfShapes() {
        return shapes.size();
    }

    public double getTotalArea() {
        // TODO: Skriv klart den här funktionen.
        return 0.0;
    }

    /**
     * Checks if all objects in the list is circles
     *
     * @return true if all shapes are circles, or if empty
     */
    public boolean isAllCircles() {
        for(Shape2D shape : shapes) if(!(shape instanceof Circle)) return false;
        return true;
    }
}
