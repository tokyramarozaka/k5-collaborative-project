package robot;

public class Robot {

    protected int x;
    protected int y;
    protected Direction direction;

    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = Direction.NORTH;
    }

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void afficherCoordonnees() {
        System.out.println("- - - - -");
        System.out.println("Nouveaux coordonnees du robot: \nx : " + this.x + "\ny : " + this.y + "\nDirection: " + this.direction);
        System.out.println("- - - - -");
    }

    public void advance() {
        switch (direction) {
            case NORTH -> y++;
            case SOUTH -> y--;
            case WEST -> x--;
            case EAST -> x++;
        }
        afficherCoordonnees();
    }

    public void turnRight() {
        switch (direction) {
            case NORTH -> direction = Direction.EAST;
            case EAST -> direction = Direction.SOUTH;
            case SOUTH -> direction = Direction.WEST;
            case WEST -> direction = Direction.NORTH;
        }
        System.out.println("Le robot a change de direction");
        afficherCoordonnees();
    }

    @Override
    public String toString() {
        return "Coordonnees du robot:\nX: " + x + "\nY: " + y + "\nDirection: " + direction;
    }
}
