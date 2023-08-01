//RENDY PRAMESTA SYAH
//227064516024

package perusahaan;

public class Programmer extends Pegawai {
    // Atribut kelas Programmer
    private int lamaBekerja;
    private double gaji;

    // Constructor untuk kelas Programmer
    public Programmer(String Nama, String jenisKelamin, String noPegawai, boolean menikah, int lamaBekerja, double gaji) {
        super(Nama, jenisKelamin, noPegawai, menikah);
        this.lamaBekerja = lamaBekerja;
        this.gaji = gaji;
    }

    // Method untuk menghitung bonus berdasarkan lama bekerja
    public double getBonus() {
        if (lamaBekerja < 5) {
            return 0.05 * gaji;
        } else {
            return 0.1 * gaji;
        }
    }

    // Method untuk menampilkan data diri pegawai (override dari kelas Pegawai)
    @Override
    public void toShow() {
        super.toShow(); // Memanggil method toShow() dari kelas Pegawai
    }
}
