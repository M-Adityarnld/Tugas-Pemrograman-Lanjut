
package Project_aditya;

/**
 *
 * @author Muhammad Aditya
 */
public class Tayo_Coba {

    
    public static void main(String[] args) {
  
    Tayo mobil = new Tayo();
        
        System.out.println(mobil.muncul());
        mobil.tampil("Tayo", "Biru", "BM 1234 TIF", 4, 60, 2);
        mobil.hitung(60, 2);
        int total = mobil.hitung(60, 2);
        System.out.println("\nTotal Jarak          : "  + total + " KM/Jam");
        System.out.println("        ~~~Program Selesai ~~~~");
    }
    
}
