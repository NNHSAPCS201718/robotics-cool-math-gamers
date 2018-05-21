import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.LCD;
import lejos.util.Delay;
import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class Program5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Program5
{
    public static void main(String[] args)
    {
        LCD.drawString("Program 5",0,0);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.A.setSpeed(720);
        Motor.B.setSpeed(720);
        Motor.C.setSpeed(720);
        for (int i = 0; i < 8; i++)
        {
            Motor.A.rotate(720,true);
            Motor.B.rotate(720,true);
            //Motor.C.rotate(720,true);
            while(Motor.A.isMoving())
            {
                System.out.println("A: " + Motor.A.getTachoCount() + "B: " + Motor.B.getTachoCount() + "C: " + Motor.C.getTachoCount());
                Delay.msDelay(200);
            }
        }
        Button.waitForAnyPress();
    }
}
