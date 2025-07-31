package robot;

public class RobotNG extends Robot {

    public RobotNG() {
        super();
    }

    public RobotNG(int x, int y, Direction direction) {
        super(x, y, direction);
    }

    public void turnLeft() {
        for (int i = 0; i < 3; i++) {
            turnRight();
        }
    }

    public void advance(int steps) {
        for (int i = 0; i < steps; i++) {
            advance();
        }
    }

    public void retreat(int steps) {
        Direction current = getDirection();
        Direction opposite = getOpposite(current);

        setDirection(opposite);
        advance(steps);
        setDirection(current);
    }

    private Direction getOpposite(Direction dir) {
        return switch (dir) {
            case NORTH -> Direction.SOUTH;
            case SOUTH -> Direction.NORTH;
            case EAST  -> Direction.WEST;
            case WEST  -> Direction.EAST;
        };
    }

    private void setDirection(Direction dir) {
        try {
            var directionField = Robot.class.getDeclaredField("direction");
            directionField.setAccessible(true);
            directionField.set(this, dir);
        } catch (Exception e) {
            throw new RuntimeException("Impossible de changer la direction");
        }
    }
}
