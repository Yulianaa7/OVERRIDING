/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainoverriding;

/**
 *
 * @author Yuliana
 */
public class Kubus extends Bangun{  //menjadikan class Kubus menjadi subclass dari class Bangun
    //mendeklarasikan variabel
    float s;
    
    //method override untuk volume
    @Override
    float volume(){
        //menghitung volume Kubus
        float volume = (s*s*s);
        System.out.println("Volume Kubus adalah "+volume); //menampilkan output
        return volume;
}
    //method override untuk luaspermukaan
    @Override
    float luaspermukaan(){
        //menghitung luaspermukaan kubus
        float luaspermukaan = 6 *s*s;
        System.out.println("Luas Permukaan Kubus adalah "+luaspermukaan); //menampilkan output
        return 0;
    }
}
