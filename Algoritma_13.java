package Tugas_PL;
/* @author Muhammad
 */
public class Algoritma_13 {

    
    public static void main(String[] args) {
       
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int totalselisih = 0;
        
        for (int hasil = 0; hasil < angka.length - 1; hasil++) {
            int selisih = angka[hasil] - angka[hasil + 1];
            System.out.println("Angka " + angka[hasil] + " - " + angka[hasil + 1] + " = " + selisih);
            totalselisih += selisih;
        }

        System.out.println("Jumlah Total Selisih Angka : " + totalselisih);
    }
}

        
        
        
        
        
 
