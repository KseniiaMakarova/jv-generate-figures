public class ShapeGeneratorTest {
    public static void main(String[] args) {
        RandomShapeGenerator generator = new RandomShapeGenerator();
        int countOfShapes = generator.getRandomNumber(1, 10);
        generator.drawRandomShapes(countOfShapes);
    }
}
