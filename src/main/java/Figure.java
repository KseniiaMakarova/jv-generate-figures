public abstract class Figure {
    protected static final String DRAW_PATTERN = "Фигура: %s, площадь: %.1f кв.см, цвет: %s, ";
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract double getArea();

    public String getColor() {
        return color;
    }
}
