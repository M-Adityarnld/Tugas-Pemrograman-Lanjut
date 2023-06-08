package Tugas_PL;
 /* @author Muhammad Aditya Rinaldi
 */
public class Algoritma_7 {
    
   public static void main(String[] args) {
      
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        System.out.println("Angka kelipatan 5 yang sebelumnya juga angka kelipatan 5 Dalam Array :");
        
        for (int lima = 1; lima < angka.length; lima++) {
            if (angka[lima] % 5 == 0 && angka[lima-1] % 5 == 0) {
                System.out.println("Angka " + angka[lima]);
            }
        }
    }
}

       
       
       
       
       
       
    
  
