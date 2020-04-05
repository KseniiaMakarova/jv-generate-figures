public class Trapeze extends Figure {
    int lowerBaseLength;
    int sideLength;
    int angleAlpha;

    public Trapeze(String color, int lowerBaseLength, int sideLength, int angleAlpha) {
        super(color);
        this.lowerBaseLength = lowerBaseLength;
        this.sideLength = sideLength;
        this.angleAlpha = angleAlpha;
        area = sideLength * Math.sin(angleAlpha)
                * (lowerBaseLength - sideLength * Math.cos(angleAlpha));
    }

    public double getTopBaseLength() {
        return lowerBaseLength - 2 * sideLength * Math.cos(angleAlpha);
    }

    @Override
    public void draw() {
        System.out.printf(DRAW_PATTERN + "нижнее основание: %d см, боковая сторона: %d см, "
                        + "верхнее основание: %.1f см.\n",
                "равнобедренная трапеция", area, color, lowerBaseLength, sideLength,
                getTopBaseLength());
    }
}
