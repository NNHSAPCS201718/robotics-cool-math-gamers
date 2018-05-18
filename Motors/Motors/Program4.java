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
        LCD.drawString("Program 4",0,0);
        Motor.A.rotate(-1440);
        while(Motor.A.isMoving()){
            if(Button.waitForAnyPress() != 0){
                Motor.A.stop();
            }
            LCD.drawString("Tacho Count" + Motor.A.getTachoCount(),0,0);
            LCD.clear();
        }
        LCD.drawString("Tacho Count" + Motor.A.getTachoCount(),0,1);
    }
}
