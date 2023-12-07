package h03;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

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

    public void setDirection(final Direction direction){
        if (direction != null){
            this.direction = direction;
        }
    }

    public void sync(){
        for (final Robot r : robots){
            final int goalX = this.x != -1 ? this.x : r.getX();
            final int goalY = this.y != -1 ? this.y : r.getY();
            final Direction goalDir = this.direction != null ? this.direction : r.getDirection();
            while (true){
                while (r.getDirection() == Direction.UP && r.getY() < goalY
                    || r.getDirection() == Direction.RIGHT && r.getX() < goalX
                    || r.getDirection() == Direction.DOWN && r.getY() > goalY
                    || r.getDirection() == Direction.LEFT && r.getX() > goalX
                ){
                    r.move();
                }
                if (goalDir == r.getDirection() && r.getX() == goalX && r.getY() == goalY){
                    break;
                }
                r.turnLeft();
            }


        }
    }

}
