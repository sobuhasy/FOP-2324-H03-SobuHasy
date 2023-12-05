package h03.robots;

import fopbot.RobotFamily;

public class ChessBoardRobot extends MultiFamilyRobot{
    public ChessBoardRobot(final int x, final int y, final RobotFamily even, final RobotFamily odd){
        super(x, y, (x + y) % 2 == 0 ? new RobotFamily[]{even, odd} : new RobotFamily[]{odd, even});
    }
}
