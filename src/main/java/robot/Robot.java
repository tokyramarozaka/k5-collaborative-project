package robot;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    // Constructeur par défaut
    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = Direction.NORTH;
    }

    // Constructeur avec arguments
    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnRight() {
        switch (direction) {
            case NORTH -> direction = Direction.EAST;
            case EAST -> direction = Direction.SOUTH;
            case SOUTH -> direction = Direction.WEST;
            case WEST -> direction = Direction.NORTH;
        }
    }

    public void advance() {
        switch (direction) {
            case NORTH -> y++;
            case SOUTH -> y--;
            case EAST -> x++;
            case WEST -> x--;
        }
    }

    // Getters nécessaires pour les tests
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}
