package h03.robots;

import fopbot.RobotFamily;


public class RGBRobot extends MultiFamilyRobot{
    private static final RobotFamily[] RGB = new RobotFamily[][RobotFamily.SQUARE_RED, RobotFamily.SQUARE_GREEN, RobotFamily.SQUARE_BLUE];

    private static final RobotFamily[] BRG = new RobotFamily[][RobotFamily.SQUARE_BLUE, RobotFamily.SQUARE_RED, RobotFamily.SQUARE_GREEN];

    public RGBRobot(final int x, final int y, final boolean inverted){
        super(x, y, !inverted ? BRG : RGB);
    }

    public void testRGB(){
        for(int i = 0; i < 3; i++){
            exchange();
        }
    }
}
