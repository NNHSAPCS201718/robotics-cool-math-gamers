import lejos.nxt.*;
import lejos.util.*;
/**
 * Write a description of class Program4 here.
 *
 * @author CoolMathGamers
 * @version 5/18/18
 */
public class Program4
{
    public static void main(String[]args){
        LCD.drawString("Program 4",0,1);
        Button.waitForAnyPress();
        LCD.clear();
        Motor.A.rotate(-1440,true);
        int count = 0;
        while(Motor.A.isMoving()){
           if(Button.ESCAPE.isDown() == true){
                Motor.A.stop();
            }
            
           LCD.drawString("Tacho Count" + Motor.A.getTachoCount(),0,count);
           count += 1;
           Delay.msDelay(200);
        }
        
        count += 1;
        LCD.drawString("Tacho Count" + Motor.A.getTachoCount(),0,count);
        Button.waitForAnyPress();
    }
}
