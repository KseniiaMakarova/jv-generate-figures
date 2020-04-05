public class Rectangle extends Figure {
    int sideLength;

    public Rectangle(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
        area = Math.pow(sideLength, 2);
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
