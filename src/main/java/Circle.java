public class Circle extends Figure{
    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        area = Math.PI * Math.pow(radius, 2);
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
