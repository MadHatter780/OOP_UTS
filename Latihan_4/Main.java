public class Main {
    public static void main(String[] args) {
        
        Mahasiswa m1 = new Mahasiswa();
        System.out.print("m1 = ");
        m1.display();

        Mahasiswa m2 = new Mahasiswa("Robby", "2025112201");
        System.out.print("m2 = ");
        m2.display();

        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.print("m3 (copy m2) =  ");
        m3.display();
    }
}
