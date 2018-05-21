import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.ButtonCounter;
/**
 * Write a description of class CircularPath here.
 * @author CoolMath-Gamers
 * @version 5/21/18
 */
public class CircularPath{   
    static DifferentialPilot pilot;
    public static void main(String[]args){
        pilot = new DifferentialPilot(3,5,Motor.A,Motor.C);
        ButtonCounter count = new ButtonCounter();
        
        while(true){
            count.count("Turn Rate x 10 AND Angle x 2");
            int turnRate = 10 * (count.getLeftCount() + count.getRightCount());
            int angle = 10 * (count.getLeftCount() + count.getRightCount());
            pilot.steer(turnRate,angle);
        }
    }
}
