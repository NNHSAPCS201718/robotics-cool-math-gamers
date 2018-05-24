import lejos.nxt.*;
import lejos.util.*;
import lejos.nxt.LCD;
import lejos.robotics.objectdetection.*;

/**
 * Write a description of class TouchToSound here.
 *
 * @author CoolMathGamers
 * @version 5/22/2018
 */
public class TouchToSound
{
    private static TouchSensor touch = new TouchSensor(SensorPort.S3);
    
    public static void main(String[] args)
    {
        LCD.drawString("Touch to Sound",0,0);
        Button.waitForAnyPress();
        LCD.clear();

        while(!touch.isPressed()){}
        Sound.beep();
        LCD.drawString("done",0,0);
        Button.waitForAnyPress();
        
    }
}
