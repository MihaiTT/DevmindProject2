public class BagFactory implements IBagFactory{


    @Override
    public IBag makeBag(String type) {
        if(type.equalsIgnoreCase("fifo"))
            return new FIFO();
        else if(type.equalsIgnoreCase("lifo"))
            return new LIFO();
        return new RandomBag();
    }
}
