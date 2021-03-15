package mainoverriding;

/**
 *
 * @author Yuliana
 */
public class Bola extends Bangun{ //menjadikan class Bola menjadi subclass dari class Bangun
    //mendeklarasikan variable
    float r;
    
    //method override untuk volume
    @Override
    float volume(){
        //menghitung volume Bola
        float volume = (float) (4*Math.PI*r*r*r/3);
        System.out.println("Volume Bola adalah "+volume); //menampilkan output
        return volume;
    }
    
    //method override untuk luaspermukaan
    @Override
    float luaspermukaan(){
        //menghitung luaspermukaan Bola
        float luaspermukaan = (float) (4*Math.PI*r*r);
        System.out.println("Luas Permukaan Bola adalah "+luaspermukaan); //menampilkan output
        return luaspermukaan;
    }
}
