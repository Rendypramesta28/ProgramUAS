//RENDY PRAMESTA SYAH
//227064516024
package perusahaan;
public class Main {
    public static void main(String[] args) {
        System.out.println("Data Pegawai:");
        System.out.println("--------------");
        // Laki-laki telah menikah
        Pegawai j1 = new Pegawai("Bambang", "Laki-laki", "J001", true);
        j1.toShow(); // Menampilkan data diri pegawai
        System.out.println("Tunjangan: " + j1.getTunjangan()); // Menampilkan tunjangan
        System.out.println();
        // Perempuan belum menikah
        Pegawai j2 = new Pegawai("Wanda", "Perempuan", "J002", false);
        j2.toShow(); // Menampilkan data diri pegawai
        System.out.println("Tunjangan: " + j2.getTunjangan()); // Menampilkan tunjangan
        System.out.println();
        
        System.out.println("Data Programmer:");
        System.out.println("---------------");
        // Laki-laki belum menikah dan telah bekerja selama 5 tahun
        Programmer pro1 = new Programmer("Rendy", "Laki-laki", "PR0G01", false, 5, 5000000);
        pro1.toShow(); // Menampilkan data diri pegawai (termasuk laki-laki dan belum menikah)
        System.out.println("Tunjangan: " + pro1.getTunjangan()); // Menampilkan tunjangan
        System.out.println("Bonus: " + pro1.getBonus()); // Menampilkan bonus
        System.out.println();
        // Wanita sudah menikah dan telah bekerja selama 2 tahun
        Programmer pro2 = new Programmer("Olivia", "Perempuan", "PR0G02", true, 2, 4500000);
        pro2.toShow(); // Menampilkan data diri pegawai (termasuk perempuan dan sudah menikah)
        System.out.println("Tunjangan: " + pro2.getTunjangan()); // Menampilkan tunjangan
        System.out.println("Bonus: " + pro2.getBonus()); // Menampilkan bonus
        System.out.println();
        // Laki-laki sudah menikah dan telah bekerja lebih dari 10 tahun
        Programmer pro3 = new Programmer("Ferdy", "Laki-laki", "PR0G03", true, 12, 7000000);
        pro3.toShow(); // Menampilkan data diri pegawai (termasuk laki-laki dan sudah menikah)
        System.out.println("Tunjangan: " + pro3.getTunjangan()); // Menampilkan tunjangan
        System.out.println("Bonus: " + pro3.getBonus()); // Menampilkan bonus
    }
}

