package Tugas_PL;
 /* @author Muhammad
 */
public class Algoritma_10 {

    public static void main(String[] args) {
        
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}; 
        
        System.out.println("Selisih angka genap dengan angka genap setelahnya : ");
        
        for (int cara = 0; cara < angka.length - 1; cara++) {
            if (angka[cara] % 2 == 0 && angka[cara + 1] % 2 == 0) {
                int selisih = angka[cara] - angka[cara + 1];
                System.out.println("Angka " + angka[cara] + " - " + "Angka " + angka[cara + 1] + " = " + selisih);
            }
    }
    
}
}