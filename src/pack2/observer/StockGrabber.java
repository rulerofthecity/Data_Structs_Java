package pack2.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {

        observers.add(newObserver);

    }

    @Override
    public void unregister(Observer observer) {

        int observerIndex = observers.indexOf(observer);
        System.out.println("Observer " + (observerIndex + 1) + " is deleted.");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(ibmPrice, applPrice, googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
