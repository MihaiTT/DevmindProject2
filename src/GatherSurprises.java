import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
    private static Random random=new Random();
    private GatherSurprises(){

    }
    public static ISurprise gather(){
        int nr=random.nextInt(3);
        switch(nr){
            case 0:
                return MinionToy.generate();
            case 1:
                return FortuneCookie.generate();
            case 2:
                return Candies.generate();
            default:
                return null;

        }}
        public static ArrayList<ISurprise> gather(int n){
            ArrayList<ISurprise> copie=new ArrayList<ISurprise>(n);
            for(int i=0;i<n;i++){
                copie.add(GatherSurprises.gather());
            }
            return copie;
        }




    }


