package robot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    @Test
    void initializeRobot_without_argument_is_at_0_0_andPointsNorth_ok() {
        var robot = new Robot();

        assertEquals(0, robot.getX());
        assertEquals(0, robot.getY());
        assertEquals(Direction.NORTH, robot.getDirection());
    }

    @Test
    void initializeRobot_with_arguments_ok() {
        var robot = new Robot(15, 20, Direction.WEST);

        assertEquals(15, robot.getX());
        assertEquals(20, robot.getY());
        assertEquals(Direction.WEST, robot.getDirection());
    }

    @Test
    void turnRight_ok() {
        var robot = new Robot(10, 10, Direction.EAST);

        robot.turnRight();
        assertEquals(Direction.SOUTH, robot.getDirection());

        robot.turnRight();
        assertEquals(Direction.WEST, robot.getDirection());

        robot.turnRight();
        assertEquals(Direction.NORTH, robot.getDirection());
    }

    @Test
    void advance_ok() {
        var robot = new Robot(0,0, Direction.EAST);

        robot.advance();
        assertEquals(1, robot.getX());
        assertEquals(0, robot.getY());
    }
}