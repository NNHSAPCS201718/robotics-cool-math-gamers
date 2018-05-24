import lejos.nxt.*;
import lejos.util.*;
import lejos.nxt.LCD;
import lejos.robotics.objectdetection.RangeFeatureDetector;
import lejos.robotics.objectdetection.*;
/**
 * Write a description of class DistanceToObject here.
 *
 * @author CoolMathGamers
 * @version 5/22/18
 */
public class DistanceToObject
{
   static UltrasonicSensor x = new UltrasonicSensor(SensorPort.S1);
   static RangeFeatureDetector detect = new RangeFeatureDetector(x,170,200);
   public static void main(String[] args)
   {
       LCD.drawString("Displays Distance To Object", 0,0);
       Button.waitForAnyPress();
       LCD.clear();
       String print = "";
       while(!Button.ESCAPE.isDown())
       {
           LCD.clear();
           Feature call = detect.scan();
           if ( call != null)
           {
               print = "" + call.getRangeReading().getRange();
               LCD.drawString(print,0,0);

           }
           Delay.msDelay(200);
        }
    }
}
