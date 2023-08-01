//RENDY PRAMESTA SYAH
//227064516024

package perusahaan;

public class Pegawai {
   // Atribut kelas Pegawai
    protected String Nama;
    protected String jenisKelamin;
    protected String noPegawai;
    protected boolean menikah;

    // Constructor untuk kelas Pegawai
    public Pegawai(String Nama, String jenisKelamin, String noPegawai, boolean menikah) {
        this.Nama = Nama;
        this.jenisKelamin = jenisKelamin;
        this.noPegawai = noPegawai;
        this.menikah = menikah;
    }

    // Method untuk menghitung tunjangan berdasarkan jenis kelamin dan status menikah
    public int getTunjangan() {
        if (jenisKelamin.equalsIgnoreCase("laki-laki")) {
            return menikah ? 200000 : 100000;
        } else {
            return menikah ? 150000 : 100000;
        }
    }

    // Method untuk menampilkan data diri pegawai
    public void toShow() {
        System.out.println("Nama: " + Nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No Pegawai: " + noPegawai);
        System.out.println("Status Menikah: " + (menikah ? "Sudah Menikah" : "Belum Menikah"));
    }
} 

