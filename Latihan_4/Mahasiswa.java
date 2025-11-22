public class Mahasiswa{
    private String nama;
    private String nim;

    public Mahasiswa(){
        this.nama = "Kosong";
        this.nim = "0000000000";
    }

    public Mahasiswa(String nama,String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public Mahasiswa(Mahasiswa other){
        this.nama = other.nama;
        this.nim = other.nim;
    }

    public void display(){
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }
}