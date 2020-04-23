import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {
   private String mesaj;
   private static ArrayList<String> zicatori=Zicatori.generateZicatori();
   private static Random random=new Random();
   @Override
   public void enjoy(){
       System.out.println("Ai primit un fortune cookie cu mesajul: " + this.mesaj);

    }
    private FortuneCookie(String mesaj){
       this.mesaj=mesaj;

    }
    public static FortuneCookie generate(){
       int n=random.nextInt(20);
       String mesaj=zicatori.get(n);
       FortuneCookie copie=new FortuneCookie(mesaj);
       return copie;
    }


}
