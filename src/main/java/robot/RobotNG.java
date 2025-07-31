package robot;

public class RobotNG extends Robot {

    public RobotNG(int x, int y, Direction direction) {
        super(x, y, direction);
    }

    public void turnLeft() {
        for (int i = 0; i < 3; i++) {
            super.turnRight();
        }
        System.out.println("Le robot vient de tourner a gauche");
    }

    public void advance(int pas) {
        for  (int i = 0; i < pas; i++) {
            super.advance();
        }
        System.out.println("Le robot a avance de " + pas + " pas.");
    }

    public void stepBack() {
        switch (direction) {
            case NORTH -> y--;
            case SOUTH -> y++;
            case EAST -> x--;
            case WEST -> x++;
        }
        System.out.println("Le robot vient de reculer");
    }
}
