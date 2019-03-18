package pack6;

public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonClass{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public BillPughSingleton getIntance(){
        return SingletonClass.INSTANCE;
    }
}
