package h03.robots;

import fopbot.Robot;
import fopbot.RobotFamily;

public class MultiFamilyRobot extends Robot{
    private final RobotFamily[] families;

    private int current = 0;

    public MultiFamilyRobot(final int x, final int y, final RobotFamily[] families){
        super(x, y, families[0]);
        this.families=families;
    }
    
}
