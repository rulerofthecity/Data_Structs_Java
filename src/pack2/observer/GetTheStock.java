package pack2.observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice){
        this.stockGrabber = stockGrabber;
        this.startTime = newStartTime;
        this.price = newPrice;
        this.stock = newStock;
    }

    @Override
    public void run() {

        for(int i = 0 ; i < 20; i++){

            try{
                Thread.sleep(2000);

            }
            catch (InterruptedException e){ }

            double randomNum = (Math.random() * (0.06)) - 0.03;

            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format(this.price + randomNum));

            if(stock.equals("IBM")){
                ((StockGrabber)stockGrabber).setIbmPrice(price);
            }

            if(stock.equals("APPL")){
                ((StockGrabber)stockGrabber).setApplPrice(price);
            }

            if(stock.equals("GOOG")){
                ((StockGrabber)stockGrabber).setGoogPrice(price);
            }

            System.out.println(stock + ": " + df.format(price + randomNum) +
                    " " + df.format(randomNum));

            System.out.println();


        }

    }
}
