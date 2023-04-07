package Scr;
import java.io.*;
import java.util.*;


//---------------------------
//
class InternetThing{
//QUESTION 1. Complete this class as described in question 1 (after correcting the compile error)
    private String manufacturer, serialNumber, ipAddress;
    private static int nextId =0;
    private static int  numThings =0;
    private int id;
    private int powerUse =0;
    protected String password;
    
    public InternetThing(){}
    //Complete InternetThing to pass case 1
    public InternetThing(String manufacturer, String serial){
        this.serialNumber = serial;
        this.manufacturer = manufacturer;
      
        
        this.ipAddress = "192.168.0." + this.nextId;
        this.id = nextId;
        this.nextId++;
        this.powerUse = 1;
        this.password = "admin";
        System.out.println("Created " + this.toString());
        numThings++;
        
    }
    
  public int getId(){
      return id;
  }
    
  public String getManufacturer(){
       return manufacturer;
   }
    
  public String getIPAddress(){
        return ipAddress;
    }  
    
    public int getPowerUse(){
        return powerUse;
    }
    
    protected String getPassword(){
        return password;
    }
    
  public static int getNumThings(){
      return numThings;
  }
    
    protected void setPassword(String password){
        this.password = password;
    }
    
    
    
    
    public String toString(){
        return "Thing#"+getId()+":made by "+ manufacturer+"@IP:"+ipAddress;
    }
    

    
    
}




