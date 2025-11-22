class AlatMusik{
    public void bunyi(){
        System.out.println("Alat musik mengeluarkan bunyi...");
    }
}

class Gitar extends AlatMusik{
    @Override
    public void bunyi(){
         System.out.println("Gitar : *jreng jreng*");
    }
}

public class Main1{
    public static void main (String[] args){
        Gitar g = new Gitar();
        g.bunyi();
    }
}