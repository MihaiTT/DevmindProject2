public class GiveSurpriseAndHug extends AbstractGiveSurprises {
    @Override
    void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");

    }
    public GiveSurpriseAndHug(String type,int waitTime){
        super(type,waitTime);

    }
}
