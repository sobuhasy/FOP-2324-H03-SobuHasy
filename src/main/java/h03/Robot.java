package h03;

import fopbot.RobotFamily;
import h03.robots.ChessBoardRobot;
import h03.robots.RGBRobots;

public class Robot {
    public Robot(int i, int i1, RobotFamily[] robotFamilies) {
        for (RobotFamily robotFamily : new RobotFamily[]{
            RobotFamily.SQUARE_AQUA, RobotFamily.SQUARE_BLACK, RobotFamily.SQUARE_GREEN
        }){
            new RGBRobots(1, 1, false);
            new RGBRobots(1, 2, true);
            new ChessBoardRobot(2, 0);
            new ChessBoardRobot(2, 1);
            new ChessBoardRobot(3, 0);
            new ChessBoardRobot(3, 1);
        }

    }

    public boolean isFrontClear() {

    }
}
