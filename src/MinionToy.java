import java.util.ArrayList;
import java.util.Random;

public class MinionToy implements ISurprise {

    private String nume;
    private static int contor=-1;
    private static ArrayList<String> colectieNume=NumeMinioni.generate();
    private MinionToy(String nume){
        this.nume=nume;

    }
    public static MinionToy generate(){
        if(contor<colectieNume.size()-1)
            contor++;
        else contor=0;
        MinionToy copie=new MinionToy(colectieNume.get(contor));
        return copie;
    }
    @Override
    public void enjoy() {
        System.out.println("Ai primit un minion cu numele "+ this.nume);
    }
}
