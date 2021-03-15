package mainoverriding;

/**
 *
 * @author Yuliana
 */
public class MainOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek bangun
        Bangun datar = new Bangun();
        //memanggil method volume dan luas permukaan
        datar.volume();
        datar.luaspermukaan();
        
        System.out.println(""); //untuk spasi 
        //membuat objek bola dan mengisi nilai
        Bola oi = new Bola(); 
        oi.r = 10;
        oi.volume();//memanggil method volume yang ada di class Bola
        oi.luaspermukaan();//memanggil method luaspermukaan yang ada di class Bola
        
        System.out.println("");
        //membuat objek kubus dan mengisi nilai
        Kubus a = new Kubus();
        a.s = 15;
        a.volume(); //memanggil method volume yang ada di class Kubus
        a.luaspermukaan(); // memanggil method luas permukaan yang ada di class Kubus
    }
    
}
