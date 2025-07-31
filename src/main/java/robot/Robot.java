package robot;

import java.util.Scanner;

public class Robot {

    protected int x = 0;
    protected int y = 0;
    protected Direction direction = Direction.NORTH;

    public Robot() {}

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Coordonnees du robot:\nX: " + x + "\nY: " + y + "\nDirection: " + direction;
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
        System.out.println("Nouveau coordonnees du robot: \nx : " + this.x + "\ny : " + this.y + "\nDirection: " + this.direction);
        System.out.println("- - - - -");
    }

    public void advance() {
        switch (this.direction) {
            case NORTH:
                this.y += 1;
                break;
            case SOUTH:
                this.y -= 1;
                break;
            case WEST:
                this.x -= 1;
                break;
            case EAST:
                this.x += 1;
                break;
        }
        afficherCoordonnees();
    }

    public void turnRight() {
        switch (this.direction) {
            case NORTH:
                this.direction = Direction.EAST;
                break;
            case WEST:
                this.direction = Direction.NORTH;
                break;
            case SOUTH:
                this.direction = Direction.WEST;
                break;
            case EAST:
                this.direction = Direction.SOUTH;
                break;
        }
        System.out.println("Le robot a change de direction");
        afficherCoordonnees();
    }

    public void afficherMenu() {
        while (true) {
            System.out.println("Choississez une option: \n1. Changer la position du robot\n2. Changer la direction du robot\n3. Voir les coordonnees\n4. Quitter");
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    advance();
                    break;
                case "2":
                    turnRight();
                    break;
                case "3":
                    afficherCoordonnees();
                    break;
                case "4":
                    System.out.println("A la prochaine !");
                    return;
                default:
                    System.out.println("Option invalide. Reessayer !");
            }
        }
    }

    public static void main(String[] args) {
        var terminator = new Robot(2, 1, Direction.NORTH);
        terminator.afficherMenu();
    }
}
