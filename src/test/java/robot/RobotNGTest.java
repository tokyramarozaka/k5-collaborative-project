package robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotNGTest {
    @Test
    void turnLeft_ok() {
        var robot = new RobotNG(0, 0, Direction.NORTH);

        robot.turnLeft();
        assertEquals(Direction.WEST, robot.getDirection());

        robot.turnLeft();
        assertEquals(Direction.SOUTH, robot.getDirection());

        robot.turnLeft();
        assertEquals(Direction.EAST, robot.getDirection());
    }

    @Test
    void stepBack_ok() {
        var robot = new RobotNG(0, 0, Direction.NORTH);

        robot.stepBack();
        assertEquals(0, robot.getX());
        assertEquals(-1, robot.getY());
    }

    @Test
    void advance_withMultipleSteps_ok() {
        var robot = new RobotNG(0, 0, Direction.NORTH);

        robot.advance(5);
        assertEquals(0, robot.getX());
        assertEquals(5, robot.getY());
    }
}