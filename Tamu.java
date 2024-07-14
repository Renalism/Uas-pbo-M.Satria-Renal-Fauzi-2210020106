public class Tamu extends Pengguna {
    private int sisaMasaAktif;
    private int tambah;

    public void menambahkanMasaAktif() {
        this.sisaMasaAktif = this.sisaMasaAktif + tambah;
    }

    @Override
    public void hapus() {
        System.out.println("DELETE FROM pengguna WHERE status='Tamu'");
    }

    @Override
    public void login() {
        System.out.println("Login sebagai tamu");
    }
}
