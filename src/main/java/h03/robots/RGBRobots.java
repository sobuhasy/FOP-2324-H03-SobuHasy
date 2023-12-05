package h03.robots;

import fopbot.RobotFamily;

import static fopBot.RobotFamily.SQUARE_BLUE;
import static fopBot.RobotFamily.SQUARE_RED;
import static fopBot.RobotFamily.SQUARE_GREEN;

public class RGBRobot extends MultiFamilyRobot{
    private static final RobotFamily[] RGB = new RobotFamily[][SQUARE_RED, SQUARE_GREEN, SQUARE_BLUE];

    private static final RobotFamily[] BRG = new RobotFamily[][SQUARE_BLUE, SQUARE_RED, SQUARE_GREEN];

    public void RGBRobot(final int x, final int y, final boolean inverted){
        super(x, y, !inverted ? BRG : RGB);
    }

    public void testRGB(){
        for(int i = 0; i < 3; i++){
            exchange();
        }
    }
}
