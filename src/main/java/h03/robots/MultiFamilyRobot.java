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

    public void exchange(){
        current = (current + 1) % families.length;
        setRobotFamily(families[current]);
    }

    @Override
    public void move(){
        super.move();
        exchange();
    }

    public void move(final boolean exchange){
        super.move();
        if (exchange){
            exchange();
        }
    }

}
