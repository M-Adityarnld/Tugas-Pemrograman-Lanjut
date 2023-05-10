
package Project_aditya;

/**
 *
 * @author Muhammad Aditya
 */
public class Tayo {
 
String muncul(){
    return "Menghitung jarak tempuh Tayo";
}    
    
void tampil (String merk, String warna, String nopol, int roda, int laju, int waktu){
    System.out.println("Merk Mobil           : " + merk);
    System.out.println("Warna Mobil          : " + warna);
    System.out.println("Nomor Polisi         : " + nopol);
    System.out.println("Jumlah Roda          : " + roda);
    System.out.println("Laju Kendaraan       : " + laju + " KM");
    System.out.println("Waktu yang di tempuh : " + waktu + " Jam");
}    

int hitung (int laju, int waktu){
      int rumus = laju * waktu;
      return rumus;
    
    }
    
}
