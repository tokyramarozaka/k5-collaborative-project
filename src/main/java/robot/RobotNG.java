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
        switch (this.direction) {
            case NORTH:
                this.y -= 1;
                break;
            case SOUTH:
                this.y += 1;
                break;
            case EAST:
                this.x -= 1;
                break;
            case WEST:
                this.x += 1;
                break;
        }
        System.out.println("Le robot vient de reculer");
    }

    public static void main(String[] args) {
        var terminator2 = new RobotNG(3, 4,  Direction.EAST);
        terminator2.turnLeft();
        System.out.println(terminator2.toString());
    }
}
