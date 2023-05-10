package com.dwifajriadit.program;

public class movie {
    private String tema;
    private String bioskop;
    private int hargaTiket;
    
public movie (){};
public movie (String tema, String bioskop, int hargaTiket){
    this.tema = tema;
    this.bioskop = bioskop;
    this.hargaTiket = hargaTiket;
}
public String getTema(){
    return tema;
}
public void setTema(String tema){
    this.tema = tema;
}
public String getBioskop(){
    return bioskop;
}
public void setBioskop(String bioskop){
    this.bioskop = bioskop;
}
public int getHargaTiket(){
    return hargaTiket;
}
public void setHargaTiket(int hargaTiket){
    this.hargaTiket = hargaTiket;
}
}

class animasi extends movie {
  
    private String sutradara;
    private String film;
    
    public animasi(){
        
    }
    
    public animasi (String sutrada, String film){
        this.sutradara = sutradara;
        this.film = film;
    }
    
    public animasi ( String tema, String bioskop, String sutrada, String film, int hargaTiket){
        this.sutradara = sutradara;
        
        this.film = film;
        
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }
    
    
    
    
    
    
    
    
    
}


    
    
    
    
    
    