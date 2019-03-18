package pack5.threadprograms;

import java.util.LinkedList;

public class ProducerConsumer {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 5;

    public void produce() throws InterruptedException{

        int value = 0;

        while(true){

            synchronized (this){
                while(list.size() == capacity){
                    wait();
                }

                System.out.println("Producer produced -- " + value);
                list.add(value++);
                notify();
                Thread.sleep(2000);
            }
        }
    }

    public void consume() throws InterruptedException{
        while(true){

            synchronized (this){
                while(list.isEmpty()){
                    wait();
                }

                int val = list.removeFirst();
                System.out.println("Consumer consumed -- " + val);
                notify();
                Thread.sleep(1000);
            }

        }
    }
}
