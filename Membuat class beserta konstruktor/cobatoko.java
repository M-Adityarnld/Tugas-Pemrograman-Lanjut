
package Project_aditya;

/**
 *
 * @author Muhammad Aditya
 */
public class cobatoko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//kita panggil kelas toko tadi dan buat nama baru
Toko jaya = new Toko(100000);  

//kita panggil method nama
 System.out.println(jaya.nama());
 
//kita panggil method barang  dan jangan lupa isi parameternya     
jaya.barang(2, 5, 5, 3);
       
//kita panggil method uang
System.out.println("Uang yang dibayarkan: Rp " + jaya.uang());

//Beri hiasan agar menarik
 System.out.println("\n~~~Terimakasih Sudah Berkunjung~~~");
 
//Setelah itu kita Run

    }
    
}
