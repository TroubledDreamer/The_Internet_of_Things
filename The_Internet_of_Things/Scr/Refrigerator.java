package Scr;
///* UNCOMMENT AFTER IMPLEMENTING InternetThing
import java.io.*;
import java.util.*;
class Refrigerator extends InternetThing {

    double basePower;
    double powerRating;
    int capacity;
    int contents =0;

    public Refrigerator(String manufacturer,String serialNumber,
            double basePower,double powerRating, int capacity)
    {
        super(manufacturer, serialNumber);
        this.basePower = basePower;
        this.powerRating= powerRating;
        this.capacity = capacity;
        this.contents = 0;
        System.out.println("Created "+this.toString());
    }



    public void insertItem(int size)
    {
        if (contents+size<capacity)
        {
            contents+=size;
            System.out.println("Inserted to "+ this.toString());
        }
    }



    public void removeItem(int size)
    {
        if (contents-size>0)
        {
            
            contents-=size;
            System.out.println("Removed from "+ this.toString());
            
        }


    }


    public String toString()
    {
        return "Thing#"+getId() +"::REFRIGERATOR, made by "+getManufacturer()+":BasePower="+basePower+":Rating="+powerRating+"@IP:"+getIPAddress();
    }
    
    //QUESTION 5. Overload getPowerUse() in Refrigerator
    
        public int getPowerUse(){
        
        return (int) basePower + capacity * (int)powerRating;
 
    }
  

    //Pass case4 by completing getPowerUse here
  
 
}
