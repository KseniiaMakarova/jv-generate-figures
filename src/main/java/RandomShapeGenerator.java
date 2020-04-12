public class RandomShapeGenerator {
    public void drawRandomShapes(int countOfShapes) {
        Figure[] figures = new Figure[countOfShapes];
        for (int i = 0; i < countOfShapes; i++) {
            switch (getRandomNumber(1, 4)) {
                case 1:
                    figures[i] = new Circle(getRandomColor(), getRandomNumber(5, 20));
                    break;
                case 2:
                    figures[i] = new Rectangle(getRandomColor(), getRandomNumber(5, 20));
                    break;
                case 3:
                    figures[i] = new Triangle(getRandomColor(),
                            getRandomNumber(5, 20), getRandomNumber(5, 20));
                    break;
                case 4:
                    int lowerBase = getRandomNumber(10, 20);
                    figures[i] = new Trapeze(getRandomColor(), lowerBase,
                            getRandomNumber(3, lowerBase / 2 - 1), getRandomNumber(20, 89));
                    break;
                default:
            }
            figures[i].draw();
        }
    }

    public int getRandomNumber(int from, int to) {
        return (int) (Math.random() * (to - from + 1)) + from;
    }

    private String getRandomColor() {
        return Colors.values()[getRandomNumber(0, 4)].name();
    }
}
