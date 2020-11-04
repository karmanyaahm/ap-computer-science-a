
/**
 * Write a description of class FirstKarel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import kareltherobot.*;

public class FirstKarel implements Directions {
    public static void main(String args[]) {
        World.readWorld("blank.kwld"); //load an empty world 
        World.setVisible(true);

        //create a robot object using the blueprint in class UrRobot
        UrRobot karel = new UrRobot(1,1,East,2);
        //the constructor takes 4 parameters
        // 1,1 is the location on the grid
        //robot facing East
        //2 is number of beepers in bag
        
        karel.move();
        karel.move();
        
        karel.putBeeper();
        
        karel.move();
        
        karel.turnLeft();
        karel.turnLeft();
        
        karel.turnOff();
    }
}
