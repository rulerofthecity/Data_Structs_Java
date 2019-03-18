package pack4;

public class PrivateConstructorClass {

    public PrivateConstructorClass(String s){
        System.out.println("Inside PrivateConstructorClass (String) ");
        int[] arr = {1,2};
    }
    private PrivateConstructorClass(int i) {
        System.out.println("Inside PrivateConstructorClass (int) ");

    }

    public static void main(String[] args) {
        PrivateConstructorClass o = new PrivateConstructorClass(10);

    }

    public void function1(){
        PrivateConstructorClass o = new PrivateConstructorClass("Nadeem");

    }
}

class ChildClassOfAboveClass extends PrivateConstructorClass{

    public ChildClassOfAboveClass(){
        super("Shoaib");
    }
}