public class TrySingleton {

    public static void main(String [] args)
    {
        Singleton singleton = Singleton.getInstance();

        singleton.printer();
        singleton.printer();

        Singleton singleton1 = Singleton.getInstance();

        singleton1.printer();

        Singleton singleton2 = Singleton.getInstance();

        singleton2.printer();
    }
}
