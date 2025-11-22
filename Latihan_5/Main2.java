class Pegawai {
    public void kerja(){
        System.out.println("Pegawai bekerja...");
    }
}

class Manajer extends Pegawai {
    public void pimpinTim() {
        System.out.println("Manajer memimpin tim...");
    }
}

class Direktur extends Manajer {
    public void tandaTanganKontrak() {
        System.out.println("Direktur menandatangani kontrak besar!");
    }
}

public class Main2 {
    public static void main(String[] args){
        Direktur d = new Direktur();
        d.kerja();
        d.pimpinTim();
        d.tandaTanganKontrak();
    }
}
