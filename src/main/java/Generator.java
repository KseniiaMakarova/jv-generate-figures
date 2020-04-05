public class Generator {
    public void generate() {
        int arrayLength = getRandomNumber(10);
        Figure[] figures = new Figure[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            switch (getRandomNumber(4)) {
                case 1:
                    figures[i] = new Circle(getRandomColor(), getRandomNumber(20));
                    break;
                case 2:
                    figures[i] = new Rectangle(getRandomColor(), getRandomNumber(20));
                    break;
                case 3:
                    figures[i] = new Triangle(getRandomColor(),
                            getRandomNumber(20), getRandomNumber(20));
                    break;
                case 4:
                    figures[i] = new Trapeze(getRandomColor(), getRandomNumber(20),
                            getRandomNumber(15), getRandomNumber(89));
                    break;
                default:
            }
            figures[i].draw();
        }
    }

    private int getRandomNumber(int to) {
        return (int) (Math.random() * to) + 1;
    }

    private String getRandomColor() {
        switch (getRandomNumber(5)) {
            case 1:
                return "синий";
            case 2:
                return "розовый";
            case 3:
                return "красный";
            case 4:
                return "лиловый";
            case 5:
                return "золотой";
            default:
        }
        return null;
    }

    public static void main(String[] args) {
        new Generator().generate();
    }
}
