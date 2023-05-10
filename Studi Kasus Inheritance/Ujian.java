package com.dwifajriadit.program;

public class Ujian {

   
    public static void main(String[] args) {
        animasi anime = new animasi ("Doraemon, stand bye me", "Fujio Fujiko");
        anime.setTema("Persahabatan");
        anime.setBioskop("CGV Cinema");
        anime.setHargaTiket(35000);
        System.out.println("Tema              :" +anime.getTema());
        System.out.println("Bioskop           :" +anime.getBioskop());
        System.out.println("Film              :" +anime.getFilm());
        System.out.println("Sutradara         :" +anime.getSutradara());
        System.out.println("Haarga Tiket      :" +anime.getHargaTiket());
        
    }
    
}
