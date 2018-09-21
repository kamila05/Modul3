package Modul3;

/**
 *
 * @author El-Savira
 */
public class Truck {
     //the Truck class has three fields
    public int cadence;
    public int gear;
    public int speed;
    public int startGear;
    //the Truck class has one construktor
    public Truck (int startCadence, int startSpeed, int starGear){
       gear = startGear;
       cadence = startCadence;
       speed = startSpeed;
    }
    //the truck class has four methods
    public void setCadence (int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void applybrake (int decrement){
        speed = decrement;
    }
    public void speedUp(int increment){
        speed = increment;
          
       
    }
}
