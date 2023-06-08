package Tugas_PL;

import java.util.Scanner;
 /* @author Muhammad
 */
public class Algoritma_2 {   
    public static void main(String[] args) {
      
        //Karena kita ingin menginputkan data dari keyboard, maka menggunakan scanner
         Scanner adit = new Scanner(System.in); 
        
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}; 
        boolean ketemu = false;
        
        do {
         //Perulangan do while digunakan untuk jika angka yang di inputkan tidak ada di dalam array
         //Maka akan melakukan perulangan dan memasukkan input angka lagi, sampai angka ditemukan dalam array
        
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari_angka = adit.nextInt();
        //Agar kita dapat memasukkan input angka yang ingin dicari dari keyboard
        
        for (int cari = 0; cari < angka.length;cari++ ) {
         //digunakan untuk apabila angka yang di inputkan ada di dalam array, maka variable ditemukan akan berubah menjadi
         //true dan operasi selesai
            if (angka[cari] == cari_angka) {
                ketemu = true;
                break;
            }    
        }
        
        if (ketemu) {
        //Jika angka yang di inputkan ada dalam array, maka akan menampilkan output tulisan dibawah
            System.out.println("Angka ditemukan dalam array");
            
        } else {
            //Jika tidak, maka akan menampilkan output tulisan dibawah dan akan dilakukan perulangan
            System.out.println("Angka tidak ditemukan dalam array");
            System.out.println("Masukkan angka lagi\n");
        }       
} while (!ketemu );
   //Perulangan hanya akan dilakukan ketika angka yang dimasukkan tidak sama dengan variable ditemukan(false)
   
        adit.close();
        //Menutup Scanner
    }
}

    
