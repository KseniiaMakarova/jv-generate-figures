public class Trapeze extends Figure {
    int lowerBaseLength;
    int sideLength;
    int angleAlpha;

    public Trapeze(String color, int lowerBaseLength, int sideLength, int angleAlpha) {
        super(color);
        this.lowerBaseLength = lowerBaseLength;
        this.sideLength = sideLength;
        this.angleAlpha = angleAlpha;
        area = sideLength * Math.sin(Math.toRadians(angleAlpha))
                * (lowerBaseLength - sideLength * Math.cos(Math.toRadians(angleAlpha)));
    }

    public double getTopBaseLength() {
        return lowerBaseLength - 2 * sideLength * Math.cos(Math.toRadians(angleAlpha));
    }

    @Override
    public void draw() {
        System.out.printf(DRAW_PATTERN + "нижнее основание: %d см, боковая сторона: %d см, угол: %d°, "
                        + "верхнее основание: %.1f см.\n",
                "равнобедренная трапеция", getArea(), getColor(), lowerBaseLength, sideLength,
                angleAlpha, getTopBaseLength());
    }
}
