public class Main
{

    public static void main(String[] args)
    {
        Monkey ape = new Monkey(4,"Bob","IDK");
        Thread t = new Thread(ape);
        //t.setDaemon(true);
        t.start();


    }
}
