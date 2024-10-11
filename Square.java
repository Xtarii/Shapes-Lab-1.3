public class Square extends Rectangle {
    public double side;

    public Square(double side) {
        super(side, side);
        
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }
}
