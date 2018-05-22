import lejos.nxt.Motor;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.util.ButtonCounter;
import lejos.nxt.Button;
/**
 * Write a description of class CircularPath here.
 * @author CoolMath-Gamers
 * @version 5/21/18
 */
public class CircularPath{   
    static DifferentialPilot pilot;
    public static void main(String[]args){
        pilot = new DifferentialPilot(56,110,Motor.A,Motor.B);
        ButtonCounter count = new ButtonCounter();
        pilot.steer(45,360);

        
    }
}
