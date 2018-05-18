import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.LCD;
import lejos.util.Delay;
import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class Program2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program2
{
    public void main(String[] args)
    {
        LCD.drawString("Program 2",0,0);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.A.setSpeed(2);
        Motor.A.forward();
        Delay.msDelay(2000);
        String s = "" + Motor.A.getTachoCount();
        LCD.drawString(s,0,0);
        Motor.A.stop();
        s = "" + Motor.A.getTachoCount();
        LCD.drawString(s,1,0);
    }
}
