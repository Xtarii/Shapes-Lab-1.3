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

    public double getTotalArea() { // skapar en variable som förvarar de olika areorna
        // som sedan loopar över varje form i listan och callar på getArea över varje form och lägger till de i totalen och sedan returnerar totalen
        double totalArea = 0.0;
        for (Shape2D shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
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
