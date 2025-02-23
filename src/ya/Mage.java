/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ya;

/**
 *
 * @author zatri
 */

class Mage extends Karakter implements Skill {
    private int mana;
    
    
    public Mage(String inama, int ilevel, int ihp, int imana){
        super(inama, ilevel, ihp);
        this.mana = imana;
    }
    
    @Override
    void serang(){
        System.out.println(nama +" menyerang dengan sihir!");
    }
    
    @Override
    void bertahan(){
        if (mana >= 10) {
            System.out.println(nama + " menggunakan mantra 'Tameng sihir'!");
            mana -= 10;
        } else {
            System.out.println(nama + " kehabisan mana!");
        }
    }
    
    @Override
    void gunakanSkill(){
        if (mana >= 10) {
            System.out.println(nama + " menggunakan mantra 'Panah sihir'!");
            mana -= 10;
        } else {
            System.out.println(nama + " tidak memiliki cukup mana!");
        }
    }
    
    @Override
    public void skillUtama(){
        if (mana >= 20) {
            System.out.println(nama + " menggunakan mantra 'Ledakan'!");
            mana -= 20;
        } else {
            System.out.println(nama + " tidak memiliki cukup mana!");
        }
    }
    
    @Override
    public void skillUltimate(){
        if (mana >= 30) {
            System.out.println(nama + " menggunakan mantra 'détruit'!");
            mana -= 30;
        } else {
            System.out.println(nama + " tidak memiliki cukup mana!");
        }
    }
    
    public void isiMana(){
        mana += 15;
        System.out.println(nama + " memulihkan mana sebanyak +15, mana sekarang : " + this.mana);
        
    }
    
    @Override
    void tampilkanStats(){
        System.out.println("\n+++===== Status =====+++");
        System.out.println("Nama    : " + nama);
        System.out.println("Level   : " + level);
        System.out.println("HP      : " + hp);
        System.out.println("Mana    : " + mana);
        System.out.println("========================\n");
    }
    
}
