import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.LCD;
/**
 * Write a description of class Program1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program1
{
    public static void main(String[] args)
    { 
        LCD.drawString("Program 1",0,0);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.A.forward();
        LCD.drawString("FORWARD",0,0);
        Button.waitForAnyPress();
        LCD.drawString("Backward",0,0);
        Motor.A.backward();
        Button.waitForAnyPress();
        Motor.A.stop();
    }
}
