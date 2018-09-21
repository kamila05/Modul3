/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author El-Savira
 */
class Employ extends Person {
    private String noKaryawan;
    //konstruktor
    public Employ(String noKaryawan, String nama, int usia) {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }

    void Employ() {
    }
    //Metode
    public void info(){
        System.out.println("No. Karyawan    : " + this.noKaryawan);
        super.info();
    }
}// Akhir Kelas employ
