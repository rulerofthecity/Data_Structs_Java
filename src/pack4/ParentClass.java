package pack4;

public class ParentClass {

    public int method1(){
        System.out.println("inside method1 of Parent class");
        return 100;
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.method1();
    }
}

class ChildClass extends ParentClass{

    public int method1(){
        System.out.println("Inside method1 of ChildClass");
        System.out.println(super.method1());
        return 200;
    }

//    public String method1(){
//
//    }

}

