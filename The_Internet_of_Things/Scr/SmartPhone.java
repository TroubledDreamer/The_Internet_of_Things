package Scr;
//QUESTION 3. Create class SmartPhone
//Pass case2 by completing SmartPhone
import java.io.*;
import java.util.*;

class SmartPhone extends InternetThing{
    String  model;
    int megaPixels;
    boolean locked; 
     
   public SmartPhone(String  manufacturer, String serialNumber,String model,int megaPixels){
        super(manufacturer, serialNumber);
 
       this.model = model;
       this.megaPixels = megaPixels;
       locked = true;
       System.out.println("Created " + this.toString());
   }
         
      public void lock(){
          this.locked = true;
          System.out.println("Locked " + this.toString());
      }
     
     public boolean isLocked(){
         return this.locked;
         
     }
     
     
      public void unlock(String pw){
          if (this.password.equals(pw)){
                 this.locked = false;
                 System.out.println("Unlocked " + this.toString());
          }
          
          }
           
 
             
     
      
      public void setPassword(String oldPassword, String newPassword){
          if (oldPassword.equals(password) && !isLocked()){
                 this.password = newPassword; 
                 System.out.println("Successfully changed password for " + this.toString());
          }
 
      }
     
     public String toString(){
         return "Thing#"+getId()+"::PHONE made by "+ getManufacturer() + ":Model=" + model + "@IP:" + getIPAddress();
     }
     
     
 
     
 }
 