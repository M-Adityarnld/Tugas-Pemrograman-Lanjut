package Tugas_PL;
/* @author Muhammad
 */
public class Algoritma_12 {

    public static void main(String[] args) {
        
     int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}; 
           
        System.out.println("Menampilkan jumlah angka dengan angka Setelahnya ");
        System.out.println("    Yang hasil penjumlahan bernilai genap        ");
        
        for (int tampil = 0; tampil < angka.length - 1; tampil++) {
            int jumlah = (angka[tampil] + angka[tampil + 1]);     
            if (jumlah % 2 == 0) {
                System.out.println( jumlah);
            }
        }       
    }   
}
