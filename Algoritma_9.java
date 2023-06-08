package Tugas_PL;
 /* @author Muhammad Aditya Rinaldi
 */
public class Algoritma_9 {

    public static void main(String[] args) {
        
       
    
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Selisih angka dalam array dengan angka setelahnya  ");
        System.out.println("           Proses Pengurangan Angka \n:              ");
        
        for (int cara = 0; cara < angka.length - 1; cara++) {
            int proses_pengurangan = angka[cara] - angka[cara + 1];
            System.out.println("Angka " + angka[cara] + " - " + "Angka " + angka[cara + 1] + " = " +  proses_pengurangan);
        }
    }
}
   
        
        
        
    
