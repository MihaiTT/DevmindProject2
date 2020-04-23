import java.util.concurrent.TimeUnit;
public abstract class AbstractGiveSurprises {
    private IBag bag;
    private BagFactory bagFactory=new BagFactory();
    private int waitTime;
    public AbstractGiveSurprises(String type,int waitTime){
        this.waitTime=waitTime;
        this.bag=bagFactory.makeBag(type);

    }
    public void put(ISurprise newSurprise){
        this.bag.put(newSurprise);
    }
    public void put(IBag surprises){
        this.bag.put(surprises);
    }
    public ISurprise give(){
        return this.bag.takeOut();
    }
    public void giveAll(){
        for(int i=0;i<this.bag.size();i++) {
            this.bag.takeOut();
            try {
                TimeUnit.SECONDS.sleep(this.waitTime); // number of seconds to sleep
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
    boolean isEmpty(){
    return this.bag.isEmpty();
    }

    abstract void giveWithPassion();



}
