package Tugas_PL;

public class Algoritma_5 {
    
    public static void main(String[] args) {
        
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("Angka yang memiliki angka 2 Di Dalam Array :");
        
        for (int two = 0; two < angka.length; two++) {
            if (dataMengandungAngka(angka[two], 2)) {
                System.out.println("Angka " + angka[two]);
            }
        }
    }
    
    // Method untuk memeriksa apakah sebuah angka mengandung digit tertentu
    public static boolean dataMengandungAngka(int angka, int  baris) {
        while (angka != 0) {
            int currentDigit = angka % 10;
            if (currentDigit == baris) {
                return true;
            }
            angka /= 10;
        }
        return false;
    }
}

    
    

