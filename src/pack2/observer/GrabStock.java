package pack2.observer;

public class GrabStock {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(100);
        stockGrabber.setApplPrice(200);
        stockGrabber.setGoogPrice(300);

        StockObserver stockObserver2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(110);
        stockGrabber.setApplPrice(210);
        stockGrabber.setGoogPrice(310);

        stockObserver2.getStockGrabber().unregister(stockObserver2);

        stockGrabber.setIbmPrice(120);
        stockGrabber.setApplPrice(220);
        stockGrabber.setGoogPrice(320);

        Runnable getIbm = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAppl = new GetTheStock(stockGrabber, 2, "APPL", 2397.00);
        Runnable getGoog = new GetTheStock(stockGrabber, 2, "GOOG", 1293.00);

        new Thread(getIbm).start();
        new Thread(getAppl).start();
        new Thread(getGoog).start();

    }
}
