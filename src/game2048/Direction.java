package game2048;

import javafx.scene.input.KeyCode;

/**
 * @author bruno.borges@oracle.com
 */
public enum Direction {

    UP(0, -1), RIGHT(1, 0), DOWN(0, 1), LEFT(-1, 0);

    private final int y;
    private final int x;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Direction{" + "y=" + y + ", x=" + x + '}' + name();
    }

    public Direction goBack() {
        switch (this) {
            case UP:
                return DOWN;
            case DOWN:
                return UP;
            case LEFT:
                return RIGHT;
            case RIGHT:
                return LEFT;
        }
        return null;
    }

    public static Direction valueFor(KeyCode keyCode) {
        return valueOf(keyCode.name());
    }
    
    public static Direction convertiDirezione(int dir)
    {
        switch (dir)
        {
            case 0:
                return UP;
            case 1:
                return RIGHT;
            case 2:
                return DOWN;
            case 3:
                return LEFT;
                
            /**
             * Con un'implementazione corretta delle specifiche di
             * GiocatoreAutomatico non si dovrebbe mai arrivare al default.
             * 
             */
            default:
                return null;
        }
    }

}
