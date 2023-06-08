package Tugas_PL;

public class Algoritma_14 {

    
    public static void main(String[] args) {
        
       int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
       
        System.out.println("Menampilkan Jumlah angka dalam Array dengan seluruh angka sebelumnya ");
        for (int tampil = 0; tampil < angka.length - 1; tampil++) {
            int total = angka[tampil] + angka[tampil + 1];
            System.out.println("Angka " + total);
        }     
    }
    
}
