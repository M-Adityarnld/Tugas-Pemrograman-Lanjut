package Tugas_PL;
/* @author Muhammad
 */
public class Algoritma_4 {
    public static void main(String[] args) {
        
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("Angka kelipatan 3 dalam array :");
        
        for (int ganjil = 0;  ganjil < angka.length; ganjil++) {
            if (angka[ganjil] % 3 == 0) {
                System.out.println("angka " + angka[ganjil]);
            }
        }
    }
}
 
        
        
        
        
    
