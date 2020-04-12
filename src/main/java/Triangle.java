public class Triangle extends Figure {
    private int legOneLength;
    private int legTwoLength;

    public Triangle(String color, int legOneLength, int legTwoLength) {
        super(color);
        this.legOneLength = legOneLength;
        this.legTwoLength = legTwoLength;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(legOneLength, 2) + Math.pow(legTwoLength, 2));
    }

    @Override
    public double getArea() {
        return legOneLength * legTwoLength / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf(DRAW_PATTERN + "катеты: %d и %d см, гипотенуза: %.1f см.\n",
                "прямоугольный треугольник", getArea(), getColor(), legOneLength, legTwoLength,
                getHypotenuse());
    }
}
