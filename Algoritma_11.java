package Tugas_PL;
/* @author Muhammad
 */
public class Algoritma_11 {

    public static void main(String[] args) {
       
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Angka yang Setelahnya Bernilai Lebih Besar :");
        for (int kecik = 0; kecik < angka.length - 1; kecik++) {
            if (angka[kecik] < angka[kecik + 1]) {
                System.out.println("Angka " + angka[kecik]);
            }
        }
    }
}

















   
