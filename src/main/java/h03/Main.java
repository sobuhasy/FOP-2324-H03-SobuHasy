package h03;

import fopbot.Direction;
import fopbot.RobotFamily;
import fopbot.World;
import h03.robots.MultiFamilyRobot;
import h03.robots.RGBRobots;
import h03.robots.ChessBoardRobot;
import h03.RobotSynchroniser;

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
            new Robot(0, 0,)
        };

        World.setVisible(true);

        for(final var robot : robots){
            for(int i = 0; i < 4; i++){
                if(!robot.isFrontClear()){
                    robot.turnLeft();
                }
                robot.move();
            }
        }

        final var rs = new RobotSynchroniser(robots);
        rs.setX(2);
        rs.setY(2);
        rs.setDirection(Direction.RIGHT);
        rs.sync();
        rs.setX(0);
        rs.setY(0);
        rs.setDirection(Direction.DOWN);
        rs.sync();
        rs.setX(4);
        rs.setY(4);
        rs.setDirection(Direction.LEFT);
        rs.sync();
    }
}
