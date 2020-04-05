public abstract class Figure {
    String color;
    double area;
    static final String DRAW_PATTERN = "Фигура: %s, площадь: %.1f кв.см, цвет: %s, ";

    public Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }
}
