package robot;

public class RobotNG extends Robot{
    public RobotNG(int x, int y, Direction direction) {
        super(x, y, direction);
    }

    public RobotNG() {
        super();
    }

    public void turnLeft() {
        for (int i = 0; i < 3; i++) {
            super.turnRight();
        }
    }

    public void stepBack() {
        super.turnRight();
        super.turnRight();
        super.advance();
        super.turnRight();
        super.turnRight();
    }

    // polymorphisme : deux formes soit advance() soit advance(5)
    public void advance(int steps) {
        for (int i = 0; i < steps; i++) {
            advance();
        }
    }
}
