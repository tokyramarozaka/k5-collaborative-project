package robot;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Robot() {
        this(0, 0, Direction.NORTH);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void turnRight(){
        if (getDirection()==Direction.NORTH){
            direction = Direction.EAST;
        }
        if (getDirection()==Direction.EAST){
            direction = Direction.SOUTH;
        }
        if (getDirection()==Direction.SOUTH){
            direction = Direction.WEST;
        }
        if (getDirection()==Direction.WEST){
            direction = Direction.NORTH;
        }
    }

    public void advance(){
        switch (direction) {
            case NORTH:
                y += 1;
                break;
            case EAST:
                x += 1;
                break;
            case SOUTH:
                y -= 1;
                break;
            case WEST:
                x -= 1;
                break;
        }
    }

}
