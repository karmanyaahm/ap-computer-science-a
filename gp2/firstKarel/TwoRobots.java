
/**
 * Demos the functions of Karel the Robot
 *
 * @author (Kaminski)
 * @version (10/26/20)
 */

import kareltherobot.*;

public class TwoRobots implements Directions {

    public static void main(String args[]) {

        //World is a class in the Karel jar file
        World.readWorld("fig2-5.kwld");  //gives us a blank grid
        World.setDelay(25);
        World.setVisible(true);

        //create a robot object
        UrRobot karel = new UrRobot(1,1,East,1);
        //robot is at (1,1) facing East with one beeper

        UrRobot carolyn = new UrRobot(3,1,East,0);

        //get the gift
        carolyn.pickBeeper();

        carolyn.move();
        carolyn.turnLeft();
        carolyn.turnLeft();
        carolyn.turnLeft();
        carolyn.move();

        //leave gift
        carolyn.putBeeper();

        //go back to start
        carolyn.turnLeft();
        carolyn.turnLeft();
        carolyn.move();
        carolyn.turnLeft();
        carolyn.move();

        //karel goes to 2,2
        karel.move();
        karel.turnLeft();
        karel.move();

        //get gift
        karel.pickBeeper();

        //spin around with joy
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();


    }
}