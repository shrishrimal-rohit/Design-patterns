public class Singleton {


    private static Singleton firstInstance = null;

    private Singleton(){ }

    int x = 10;
    public static Singleton getInstance(){
        if(firstInstance == null)
        {
            firstInstance = new Singleton();
        }
        return firstInstance;
    }


    public void printer()
    {
        System.out.println(x++);
    }
}
