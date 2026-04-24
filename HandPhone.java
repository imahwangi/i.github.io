public class HandPhone { // Menambahkan kurung kurawal buka
    String jenis_hp;
    int tahun_pembuatan;

    // Perbaikan: Method setter tidak boleh diawali tipe data 'String' jika bermaksud void
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp; // Menggunakan 'this' untuk membedakan atribut dan parameter
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Perbaikan: Menambahkan kata kunci 'return'
    public String getJenisHP() {
        return jenis_hp;
    }

    // Perbaikan: Menambahkan kata kunci 'return'
    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    // Perbaikan: Urutan 'public static void main' harus benar
    public static void main(String args[]) {
        HandPhone hp = new HandPhone();
        
        // Mengisi data (Contoh input)
        hp.setDataHP("Samsung", 2023);
        
        // Perbaikan: Menambahkan System.out.println dan titik koma
        System.out.println("Jenis HP: " + hp.getJenisHP());
        System.out.println("Tahun: " + hp.getTahunPembuatan());
    }
}