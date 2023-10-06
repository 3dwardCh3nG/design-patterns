package sydney.ch3ng.design_pattern.observer;

public class StockBuyer implements Observer {
    @Override
    public void update(Subject subject) {
        if (subject instanceof StockPrice) {
            StockPrice stockPrice = (StockPrice) subject;
            if (stockPrice.getPrice() > 10) {
                // Buy stocks
                System.out.println("Buy stocks");
            }
        }
    }
}
