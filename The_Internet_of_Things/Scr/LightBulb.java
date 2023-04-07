package Scr;
//QUESTION 4. Create class LightBulb
//Pass case3 by completing LightBulb
import java.io.*;
import java.util.*;

class LightBulb extends InternetThing{
    int lumenCount;
    boolean lightOn;
    
    public LightBulb(String manufacturer, String serialNumber, int lumenCount){
        super(manufacturer, serialNumber);
        this.lumenCount = lumenCount;
        this.lightOn = false;
        System.out.println("Created " + toString());
        
    }
    
    public void turnOn(){
        this.lightOn = true;
        System.out.println("Turned on " + this.toString());
        
    }
    public void turnOff(){
        this.lightOn = false;
        System.out.println("Turned off " + this.toString());
    }
    @Override
    public int getPowerUse(){
        if (this.lightOn){
            return this.lumenCount * super.getPowerUse();
        }
        else{
            return 0;
        }
    }
    

    
 }
