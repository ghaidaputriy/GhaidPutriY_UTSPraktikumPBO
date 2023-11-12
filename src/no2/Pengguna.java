/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author User
 */
public abstract class Pengguna {
    private String nama;
    
    //Konstruktor
    public Pengguna(String nama){
        this.nama = nama;
    }
    
    //Getter
    public String getNama(){
        return nama;
    }
    
    //abstrak implementasi kelas turunan
    public abstract void tampilkanInfo();
    
    //abstark menentukan peran pengguna
    public abstract String peran();
    
}
