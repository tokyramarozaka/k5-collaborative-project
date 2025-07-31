package robot;

public class Robot {
    private  int x;
    private  int y;
    private Directions direction;

    public Robot(int x, int y, Directions direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    //-------------getters-------------

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Directions getDirection() {
        return direction;
    }

    //---------------------COdes-----------------------

    static void advance(){

    }

    static void turnLeft(){

    }

    static void turnRight(){

    }

    static void stepBack(){

    }


    public static void main(String[] args) {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
}