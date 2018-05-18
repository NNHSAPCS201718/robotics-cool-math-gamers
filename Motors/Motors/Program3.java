import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.LCD;
import lejos.util.Delay;
import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class Program3 here.
 *
 * @author Cool-MathGamers
 * @version (a version number or a date)
 */
public class Program3
{
    public static void main(String[]args){
        LCD.drawString("Program 3",0,0);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.A.rotate(1440);
        LCD.drawString("" + Motor.A.getTachoCount(),0,0);
        Motor.A.rotateTo(0);
        LCD.drawString("" + Motor.A.getTachoCount(),0,1);
        Button.waitForAnyPress();
    }
}
