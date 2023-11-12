/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author User
 */
public class User extends Pengguna {
    public User(String nama){
        super(nama);
    }
    
    //implementasi menampilkan user
    public void tampilkanInfo(){
        System.out.println("User    : " + getNama());
    }
    
    //implementasi menentukan perat user
    public String peran(){
        return "Customer";
    }
}
