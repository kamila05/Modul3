package Modul3;

/**
 *
 * @author El-Savira
 */
class Person {
    private String nama;
    private int usia;
    
    //Konstruktor
    public Person (String nama, int usia){
        this.nama   = nama;
        this.usia   = usia;
    } 
    //Method
    public void info(){
        System.out.println("Nama    : " + this.nama);
        System.out.println("Usia    : " + this.usia);
    }
}
