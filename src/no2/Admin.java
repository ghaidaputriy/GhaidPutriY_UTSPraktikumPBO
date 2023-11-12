/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author User
 */
public class Admin extends Pengguna{
    public Admin(String nama){
        super(nama);
    }
    
    //implementasi menampilkan informasi admin
    public void tampilkanInfo(){
        System.out.println("Admin   : " + getNama());
    }
    
    //implementasi menentukan peran admin
    public String peran(){
        return "Admin";
    }
}
