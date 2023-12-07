package h03;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

import static fopbot.Direction.DOWN;
import static fopbot.Direction.LEFT;
import static fopbot.Direction.RIGHT;
import static fopbot.Direction.UP;

public class RobotSynchroniser {
    private final Robot[] robots;

    private int x = -1;
    private int y = -1;
    private Direction direction = null;

    public RobotSynchroniser(final Robot[] robots){
        this.robots = robots;
    }

    public void setX(final int x){
        if (x >= 0 && x < World.getWidth()){
            this.x = x;
        }
    }

    public void setY(final int y){
        if(y >= 0 && y < World.getHeight()){
            this.y = y;
        }
    }

}
