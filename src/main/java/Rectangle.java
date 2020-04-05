public class Rectangle extends Figure {
    private int sideLength;

    public Rectangle(String color, int sideLength) {
        super(color, Math.pow(sideLength, 2));
        this.sideLength = sideLength;
    }

    public int getPerimeter() {
        return sideLength * 4;
    }

    @Override
    public void draw() {
        System.out.printf(DRAW_PATTERN + "длина стороны: %d см, периметр: %d см.\n",
                "квадрат", getArea(), getColor(), sideLength, getPerimeter());
    }
}
