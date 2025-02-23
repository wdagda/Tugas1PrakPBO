/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ya;

/**
 *
 * @author zatri
 */


// class abstrak
abstract class Karakter{
    String nama;
    int level;
    int hp;
    
    //constructor
    public Karakter(String inama, int ilevel, int ihp){
        this.nama = inama;
        this.level = ilevel;
        this.hp = ihp;
    }
    
    //method abstract
    abstract void serang();
    abstract void bertahan();
    abstract void gunakanSkill();
    
    void tampilkanStats(){
        System.out.println("\n+++===== Status =====+++");
        System.out.println("Nama    : " + nama);
        System.out.println("Level   : " + level);
        System.out.println("HP      : " + hp);
        System.out.println("========================\n");
    }
    
}