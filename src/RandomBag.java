import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {
    private static Random random=new Random();
    private ArrayList<ISurprise> bag=new ArrayList<ISurprise>();
    @Override
    public void put(ISurprise newSurprise) {
        this.bag.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while(bagOfSurprises.isEmpty()==false)
            this.bag.add(bagOfSurprises.takeOut());

    }

    @Override
    public ISurprise takeOut() {
        if(this.isEmpty()==false){
            int nr=random.nextInt(this.bag.size());
            ISurprise copie=this.bag.get(nr);
            this.bag.remove(nr);
            return copie;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        if(this.bag.size()==0)
            return true;
        return false;
    }

    @Override
    public int size() {
        return this.bag.size();

    }
}
