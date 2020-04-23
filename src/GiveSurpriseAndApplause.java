public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

    @Override
    void giveWithPassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive.");

    }
    public GiveSurpriseAndApplause(String type,int waitTime){
        super(type,waitTime);

    }
}
