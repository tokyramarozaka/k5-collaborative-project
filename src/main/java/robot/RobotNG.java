package robot;

public class RobotNG extends Robot {
    public RobotNG(int x, int y, Direction direction) {
        super(x, y, direction);
    }

    public RobotNG (){
        super();
    }

    public void turnLeft(){
        for (int i = 0; i < 3; i++) {
            turnRight();
        }
    }

    public void stepBack(){
        Direction originalDirection = getDirection();
        switch (originalDirection) {
            case NORTH:
                setDirection(Direction.SOUTH);
                break;
            case SOUTH:
                setDirection(Direction.NORTH);
                break;
            case EAST:
                setDirection(Direction.WEST);
                break;
            case WEST:
                setDirection(Direction.EAST);
                break;
        }
    }

    public void advance(int steps){
        if (steps < 0) {
            throw new IllegalArgumentException("Steps number not accepted. Should be positive");
        }
        for (int i = 0; i < steps; i++) {
            super.advance();
        }
    }

}
