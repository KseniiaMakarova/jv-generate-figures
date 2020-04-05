public class Generator {
    public void generate() {
        int arrayLength = getRandomNumber(1, 10);
        Figure[] figures = new Figure[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
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

    private int getRandomNumber(int from, int to) {
        return (int) (Math.random() * (to - from + 1)) + from;
    }

    private String getRandomColor() {
        switch (getRandomNumber(1, 5)) {
            case 1:
                return "синий";
            case 2:
                return "розовый";
            case 3:
                return "красный";
            case 4:
                return "лиловый";
            case 5:
                return "золотистый";
            default:
        }
        return null;
    }

    public static void main(String[] args) {
        new Generator().generate();
    }
}
