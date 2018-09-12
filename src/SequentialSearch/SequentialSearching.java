/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SequentialSearch;

/**
 *
 * @author El-Savira
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
public class SequentialSearching {
    
  public static void main(String[]args) throws IOException{
      System.out.println("Aisyah Kamila El Savira/ X RPL 6/ 04");
      // Objek BufferedReader
    InputStreamReader isr   = new InputStreamReader(System.in);
    BufferedReader dataln   = new BufferedReader(isr);
    
    // Input jumlah Data
    System.out.print("Masukkan jumlah Data : ");
    int jlh_data = Integer.parseInt(dataln.readLine());
    
    // Array Data sebagai penampung nilai Data
    int[] data  = new int[jlh_data];
    
    // Pilih Metode Pengisian Data
    System.out.println("\nPENGISIAN DATA");
    System.out.println("1. Di input oleh user");
    System.out.print("2. Di input oleh program --> Pilihan [1/2]:");
    int isi = Integer.parseInt(dataln.readLine());
    switch (isi){
        case 1: // Pengisian Data dilakukan oleh si user
            System.out.println();
            for(int a = 0; a < jlh_data; a++){
                System.out.print("Data ke-" + (a + 1) + " : ");
                data[a] = Integer.parseInt(dataln.readLine());
            }
            break;
            
        case 2: // Pengisian data dilakukan oleh program secara random
            for(int a = 0; a < jlh_data; a++){
                data[a] = new Random().nextInt(201); // Data di isi secara random dengan nilai tertinggi 200
            }
            // Tampilkan data yang telah di isi oleh program
            System.out.println("\nTampilkan Data");
            for(int a = 0; a < jlh_data; a++){
                System.out.println("Data ke-" + (a + 1) + " : " + data[a]);
            }
            
            break;
            
        default:
            System.out.println("Pilih tidak tersedia"); // Jika pilihan menu tidak sesuai
    }
    // Input data yang dicari
    System.out.print("\nInput Data yang dicari : ");
    int cari    = Integer.parseInt(dataln.readLine());
    
    // Proses Sequential Serching
    boolean temu    = false; // Variable indikator jika data sudah ditemukan
    int urutan      = 0;
    for(int a = 0; a < jlh_data; a++){
        System.out.print(data[a] + "==" + cari);
        if(data[a] == cari){
            System.out.println(" --> Data ketemu");
            urutan  = a + 1; // Kenapa a + 1? karena a merupakan posisi index dimana index dimulai dari 0
            temu    = true;  // Sedangkan user menghitungnya dari 1.
            break;
        } else{
            System.out.println(" --> Data belum ketemu");
        }
    }
    if (temu == true){
        System.out.println("\nData ditemukan pada urutan ke-" + (urutan));
    } else{
        System.out.println("\nData tidak ditemukan");
    }
  }    
}
