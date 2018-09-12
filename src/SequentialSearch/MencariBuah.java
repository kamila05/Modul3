package SequentialSearch;

/**
 *
 * @author El-Savira
 */
import javax.swing.JOptionPane;

public class MencariBuah {
    
    public static void main(String[] args){
        System.out.println("Aisyah Kamila El Savira/X RPL 6/04");
        String data[] = new String[5];
        int i;
        String nama_buah, cari;
        boolean ketemu;
        
        //input data array sebanyak
        for (i = 0; i < data.length; i++){
            nama_buah   = String.valueOf(JOptionPane.showInputDialog("Masukkan Nama Buah ke-" + (i + 1)));
            data[i] = nama_buah;
        }
        //tampilkan data setalah proses input
        System.out.print("Nama Buah yang Dimasukkan = { ");
        for (i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("}");
        //input data yang dicari
        cari   = String.valueOf(JOptionPane.showInputDialog("Masukkan Nama Buah yang dicari"));
        System.out.println("Nama buah yang dicari : " + cari);
        //proses pencarian data dengan metode squential search
        ketemu = false;
        for (i = 0; i < data.length; i++){
            if (cari.equals(data[i])){
                ketemu = true;
                break;
            }
        }
        if (ketemu){
            System.out.println(cari + " ditemukan dalam urutan ke-" + (i + 1));
        } else {
            System.out.println(cari + " tidak ditemukan");
        }
    }  
}
