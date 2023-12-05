package h03.robots;

import fopbot.RobotFamily;

import static fopbot.RobotFamily.SQUARE_BLUE;
import static fopbot.RobotFamily.SQUARE_GREEN;
import static fopbot.RobotFamily.SQUARE_RED;
public class RGBRobots extends MultiFamilyRobot{
    private static final RobotFamily[] RGB = new RobotFamily[][SQUARE_RED, SQUARE_GREEN, SQUARE_BLUE];

    private static final RobotFamily[] BRG = new RobotFamily[][SQUARE_BLUE, SQUARE_RED, SQUARE_GREEN];

    private static final RobotFamily[] BGR = new RobotFamily[][SQUARE_BLUE, SQUARE_GREEN, SQUARE_RED];

    private static final RobotFamily[] GRB = new RobotFamily[][SQUARE_GREEN, SQUARE_RED, SQUARE_BLUE];

    public RGBrobot(final int x, final int y, final boolean inverted){
        super(x, y, !inverted ? RGB : BRG);
    }

    public void testRGB(){
        for(int i = 0; i < 3; i++){
            exchange();
        }
    }
}
