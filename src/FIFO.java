import java.lang.reflect.Array;
import java.util.ArrayList;

public class FIFO implements IBag {
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
            ISurprise copie=this.bag.get(0);
            this.bag.remove(0);
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
