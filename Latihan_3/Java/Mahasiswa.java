public class Mahasiswa {
    private String nama;
    private String nim;

    public String getNama()
    {
        return nama;
    }
    public String getNim()
    {
        return nim;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setNim(String nim){
        if(nim != null && nim.matches("\\d{10}")){
            this.nim = nim;
        }
        else{
            System.out.println("NIM tidak valid! Harus 10 digit angka.");
        }
    }

    
    
}
