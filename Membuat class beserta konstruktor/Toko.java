
package Project_aditya;

/**
 *
 * @author Muhammad Aditya
 */
public class Toko {
 
  //Pertama, kita buat dulu variabelnya
 int uang;
 
 //Setelah itu,kita buat konstruksinya, disini saya menggunakan konstruksi dengan parameter dan yang tampa parameter
 
public Toko(int uang){
 this.uang = uang;    
 }
 
Toko() {       
 }

//selanjutnya kita buat method nya, disini saya membuat 3 method, ada yg void dan non void

String nama(){
    return "Selamat datang di Toko JayaSelalu";
}

public int uang(){
    return uang;   
}

public void barang(int jajan, int kopi, int roti, int teh ){
 
    System.out.println("Jajanan = Rp " + jajan * 1000);
    System.out.println("Kopi    = Rp " + kopi * 2000);
    System.out.println("Roti    = Rp " + roti * 1000);
    System.out.println("Teh     = Rp " + teh * 5000);
    
    int total = jajan + kopi + roti + teh;
    int harga = jajan * 1000 + kopi * 2000 + roti * 1000 + teh * 5000;
    System.out.println("Total barang        : " + total );
    System.out.println("Harga total  barang : Rp " + harga);
   
    int kembalian = uang - harga;
    System.out.println("Kembaliannya        : Rp " + kembalian);
}
}

//Setelah semua selesai,silahkan buat java main class untuk menjalankan class Toko ini