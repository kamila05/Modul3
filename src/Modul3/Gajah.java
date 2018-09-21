package Modul3;

/**
 *
 * @author El-Savira
 */
public class Gajah extends Hewan {
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan...");
    }
    //meng-override method pada class Animal
    public void testInstanceMethod(){
        System.out.println("The Intance Method in Gajah...");
    }
    public static void main (String[] args){
        Gajah myGajah   = new Gajah();
        Hewan myHewan   = myGajah;
        Hewan.testClassMethod();
        myHewan.testIntenceMethod();
    }
}
