package pack1;

import javax.management.QueryEval;
import java.util.ArrayList;

//this is a queue implementation
public class MyQueue {

    private ArrayList<String> queue = new ArrayList<>(10);
    private static int FRONT = 0;
    private static int BACK = -1;

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        System.out.println("--- Queue at the start ---");
        System.out.println(queue.getQueue().isEmpty()?"Empty queue": "--- Queue snapshot ---\n"+queue.getQueue());

        queue.push("A");
        queue.push("B");
        queue.push("C");

        queue.pop();
        queue.front();
        queue.push("G");

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.front();

    }

    public void push(String value){
        System.out.println("--- Push Operation ---");
        ++BACK;
        getQueue().add(BACK, value);
        System.out.println(value + " is pushed into queue");
        System.out.println("--- Queue snapshot ---");
        System.out.println(getQueue());
    }

    public String pop(){
        System.out.println("--- Pop Operation ---");

        if(BACK >= FRONT) {
            String value = getQueue().set(FRONT, null);
            ++FRONT;
            System.out.println(value + " is poped out of queue");
            System.out.println("--- Queue snapshot ---");
            System.out.println(getQueue());
            return value;
        }
        else{
            System.out.println("--- Queue snapshot ---");
            System.out.println(getQueue());
            System.out.println("Queue is empty!!!");
            return null;
        }
    }

    public String front(){
        System.out.println("--- Front seek Operation ---");
        System.out.println("--- Queue snapshot ---");
        System.out.println(getQueue());
        if(BACK >= FRONT){
            System.out.println(getQueue().get(FRONT));
            return getQueue().get(FRONT);
        }
        else{
            System.out.println("Queue is empty!!!");
            return null;
        }

    }

    public boolean isEmpty(){
        System.out.println("--- isEmpty Operation ---");
        System.out.println("--- Queue snapshot ---");
        System.out.println(getQueue());
        System.out.println(getQueue().isEmpty());
        return getQueue().isEmpty();
    }

    public ArrayList<String> getQueue() {
        return queue;
    }

    public void setQueue(ArrayList<String> queue) {
        this.queue = queue;
    }

    @Override
    public String toString() {
        return getQueue().toString();
    }
}
