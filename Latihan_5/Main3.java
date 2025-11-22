class AkunBank{
    private double saldo = 100000;
    protected String pemilik;
    public String bank = "Bank A";

    public double getSaldo(){
        return saldo;
    }

    protected void setor(double jumlah){
        saldo += jumlah;
    }

}

class RekeningTabungan extends AkunBank {
    public void info() {
        pemilik = "Robby"; // bisa: protected
        System.out.println("Pemilik: " + pemilik);
        System.out.println("Bank: " + bank); // bisa: public

        System.out.println("Saldo Awal: " + getSaldo()); // **akses private lewat getter**
        setor(500000); // bisa, karena protected
        System.out.println("Saldo Setelah Setor: " + getSaldo());
    }
}

public class Main3 {
    public static void main(String[] args) {
        RekeningTabungan r = new RekeningTabungan();
        r.info();
    }
}