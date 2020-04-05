public abstract class Figure {
    private String color;
    private double area;
    protected static final String DRAW_PATTERN = "Фигура: %s, площадь: %.1f кв.см, цвет: %s, ";

    public Figure(String color, double area) {
        this.color = color;
        this.area = area;
    }

    public abstract void draw();

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }
}
