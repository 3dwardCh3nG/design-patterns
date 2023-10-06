package sydney.ch3ng.design_pattern.observer;

/**
 * The observer design pattern is a behavioral design pattern that allows an object (known as the subject) to notify a set of objects (known as observers) when its state changes. The observers are dependent on the subject and are notified whenever the subject’s state changes so that they can update themselves accordingly.
 */
public class Driver {
    public static void main(String[] args) {
        Observer stockBuyer = new StockBuyer();
        StockPrice stockPrice = new StockPrice();
        stockPrice.attach(stockBuyer);
        stockPrice.setPrice(1);
        stockPrice.notifyObservers();
        stockPrice.setPrice(5);
        stockPrice.notifyObservers();
        stockPrice.setPrice(10);
        stockPrice.notifyObservers();
        stockPrice.setPrice(11);
        stockPrice.notifyObservers();
        stockPrice.setPrice(9);
        stockPrice.notifyObservers();
        stockPrice.setPrice(15);
        stockPrice.notifyObservers();
    }
}
