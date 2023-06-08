
package Tugas_PL;

public class Algoritma_6 {

    public static void main(String[] args) {
        
   
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("Angka ganjil yang diapit oleh angka genap Dalam Array :");
        
        for (int coba = 1; coba < angka.length - 1; coba++) {
            if (angka[coba] % 2 != 0 && angka[coba-1] % 2 == 0 && angka[coba+1] % 2 == 0) {
                System.out.println("Angka " + angka[coba]);
            }
        }
    }
}
   
        
        
        
 