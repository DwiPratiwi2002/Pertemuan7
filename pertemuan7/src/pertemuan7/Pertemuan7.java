package pertemuan7;

/**
 *
 *Ni Kadek Dwi Pratiwi
 * Nim = 2201010051
 * Kelas = U
 * Tgl 06 Mei 2024
 */
public class Pertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        induk a2 = new induk("ss",8);
        Turunan1 a1 = new Turunan1();
        
        System.out.println("1. Isi Dari Nama Variabel Nama"+a1.getNAMA());
        a1.setNAMA("I Wayan Made Putu Kadek Komang Ketut");
        System.out.println("2. Isi Dari Nama Variabel Nama"+a1.getNAMA());
        
        a1.setNAMA();
        System.out.print("3. Isi Dari Nama Variabel Nama"+a1.getNAMA());
        
        
         a1.cetakNAMA();
         a1.cetakNAMA();
    }
    
}
