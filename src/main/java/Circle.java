public class Circle extends Figure{
    private int radius;

    public Circle(String color, int radius) {
        super(color, Math.PI * Math.pow(radius, 2));
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf(DRAW_PATTERN + "радиус: %d см, длина окружности: %.1f см.\n",
                "круг", getArea(), getColor(), radius, getCircumference());
    }
}
