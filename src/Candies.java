import java.util.ArrayList;
import java.util.Random;

public class Candies implements ISurprise {
    private int nr;
    private static Random random=new Random();
    private String type;
    private static ArrayList<String> tipuriBomboane=TipuriBomboane.generate();
    private Candies(int nr,String type){
        this.nr=nr;
        this.type=type;

    }
    public static Candies generate() {
        String tip=tipuriBomboane.get(random.nextInt(4));
        int t = random.nextInt(17);
        Candies copie=new Candies(t,tip);
        return copie;

    }
    @Override
    public void enjoy(){
        System.out.println("Ai primit " + this.nr + " bomboane de tip "+ this.type);


    }

}
