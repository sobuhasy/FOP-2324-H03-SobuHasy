package h03;

import fopbot.RobotFamily;
import fopbot.World;
import h03.robots.MultiFamilyRobot;
import h03.robots.RGBRobots;
import h03.robots.ChessBoardRobot;

/**
 * Main entry point in executing the program.
 */
public class Main {
    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        World.setSize(5, 5);

        final var robots = new Robot[]{
            new MultiFamilyRobot(0, 0,
                new RobotFamily[]{
                    RobotFamily.SQUARE_AQUA, RobotFamily.SQUARE_BLACK, RobotFamily.SQUARE_GREEN
            }
            ),
            new RGBRobots(1, 1, false),
            new RGBRobots(1, 2, true),
            new ChessBoardRobot(2, 0),
            new ChessBoardRobot(2, 1),
            new ChessBoardRobot(3, 0),
            new ChessBoardRobot(3, 1),
        };


        World.setVisible(true);
    }
}
