package h03;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.RobotFamily;
import fopbot.World;
import h03.robots.MultiFamilyRobot;
import h03.robots.RGBRobot;
import h03.robots.ChessBoardRobot;


public class Main {

    public static void main(final String[] args) {
        World.setSize(5, 5);

        final var robots = new Robot[]{
            new MultiFamilyRobot(
                0,
                0,
                new RobotFamily[]{RobotFamily.SQUARE_AQUA, RobotFamily.SQUARE_BLACK, RobotFamily.SQUARE_GREEN}
            ),
            new RGBRobot(1, 1, false),
            new RGBRobot(1, 2, true),
            new ChessBoardRobot(2, 0),
            new ChessBoardRobot(2, 1),
            new ChessBoardRobot(3, 0),
            new ChessBoardRobot(3, 1),
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
