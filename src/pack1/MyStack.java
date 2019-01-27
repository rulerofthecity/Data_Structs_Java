package pack1;

import java.util.ArrayList;

public class MyStack<T> {

    private static int MAX_SIZE = 10;

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(5);
        stack.push(4);
        stack.push(8);
        stack.push(5);
        stack.push(4);
        stack.push(8);
        stack.push(5);
        stack.push(4);
        stack.push(8);
        stack.push(5);
        stack.push(4);
        stack.push(8);
        stack.pop();
        System.out.println("Top - " + stack.top());
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

    }

    private ArrayList<T> stack = new ArrayList<>(10);

    public void push(T value){
        System.out.println("--- Push Operation ---");
        if(getStack().size() < MAX_SIZE){
            getStack().add(value);
        }
        else{
            System.out.println("Stack is full!!");
        }
        System.out.println("Stack -- " + getStack());
    }

    public void pop(){
        System.out.println("--- Pop Operation ---");
        if(!getStack().isEmpty()){
            getStack().remove(getStack().size()-1);
        }else{
            System.out.println("Stack is empty!!");
        }
        System.out.println("Stack -- " + getStack());
    }

    public T top(){
        System.out.println("--- Top Operation ---");
        if(!getStack().isEmpty()){
            return getStack().get(getStack().size()-1);
        }
        else{
            return null;
        }
    }


    public boolean isEmpty(){
        return stack.size() == 0 ? true : false;
    }
    public void setStack(ArrayList<T> stack) {
        this.stack = stack;
    }

    public ArrayList<T> getStack() {
        return stack;
    }

}
