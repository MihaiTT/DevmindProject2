public class Main {
    public static void main(String[] args){
        IBag fifo,lifo,random;
        fifo=new FIFO();
        lifo=new LIFO();
        random=new RandomBag();
        System.out.println(fifo.isEmpty());
        ISurprise s1=FortuneCookie.generate();
        s1.enjoy();
        ISurprise s2=Candies.generate();
        s2.enjoy();
        fifo.put(s1);
        fifo.put(s2);
        System.out.println(fifo.size());
        ISurprise s3=MinionToy.generate();
        s3.enjoy();
        ISurprise s4=MinionToy.generate();
        s4.enjoy();
        fifo.takeOut();
        GiveSurpriseAndSing g1=new GiveSurpriseAndSing("fifo",2);
        g1.giveWithPassion();


    }
}
