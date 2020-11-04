
/**
 * Writes the letter 'K' using Karel the Robot with Beepers
 *
 * @author (Karmanyaah Malhotra)
 * @version (10/29/2020)
 */
import kareltherobot.*;

public class WriteName implements Directions {
    public static void main(String args[]) {

        World.readWorld("blank.kwld"); // load an empty world
        World.setDelay(20);
        World.setVisible(true);

        // create a robot object using the blueprint in class UrRobot
        UrRobot karel = new UrRobot(1, 1, North, 200);

        moveAndDrop(6, karel);
        turn(3, karel);
        move(3, karel);
        turn(2, karel);
        dropAndMoveDiagonal(3, karel);
        turn(2, karel);
        move(1, karel);
        turn(3, karel);
        dropAndMoveDiagonal(3, karel);
        karel.turnOff();
    }

    private static void turn(int inp, UrRobot karel) {
        for (int i = inp; i > 0; i--)
            karel.turnLeft();
    }

    private static void moveAndDrop(int inp, UrRobot karel) {
        for (int i = inp; i > 0; i--) {
            karel.move();
            karel.putBeeper();
        }
    }

    private static void dropAndMoveDiagonal(int inp, UrRobot karel) {
        for (int i = inp; i > 0; i--) {
            karel.putBeeper();
            karel.move();
            turn(1, karel);
            karel.move();
            turn(3, karel);
        }
    }

    private static void move(int inp, UrRobot karel) {
        for (int i = inp; i > 0; i--) {
            karel.move();
        }
    }

}
