package pertemuan7;

/**
 *Ni Kadek Dwi Pratiwi
 * Nim = 2201010051
 * Kelas = U
 * Tgl 06 Mei 2024
 */

public class induk {
    private String nama;
    public int nilai=0;
    
    public induk (String nm, int nl){
        nama = nm;
        nilai = nl;
    }  
    public void setNAMA(String nVAL){
        this.nama = nVAL;
    }
    public void setNAMA(){
        this.nama = " Siapa Ya?";
        
    }
    public String getNAMA(){
        return this.nama;
    }
    public void cetakNAMA(){
        System.out.printf("\nIsi Variabel nama: %s dengan tinggi berat badan %d  \n \n", this.nama,this.nilai);
    }
}
