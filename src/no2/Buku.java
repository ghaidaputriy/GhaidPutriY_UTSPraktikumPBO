/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author User
 */
public class Buku {
    private String judul, genre;
    
    public Buku (String judul, String genre){
        this.judul = judul;
        this.genre = genre;
    }
    
    //menampilkan informasi buku
    public String toString(){
        return "Judul Buku   : " + judul + "\n   Genre Buku   : " + genre;
    }
}    