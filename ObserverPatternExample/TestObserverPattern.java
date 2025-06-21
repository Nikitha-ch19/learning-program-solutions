public class TestObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile1 = new MobileApp("Groww");
        Observer web1 = new WebApp("MoneyControl");

        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(web1);

        stockMarket.setPrice(345.75f);
        stockMarket.setPrice(350.50f);

        stockMarket.removeObserver(web1);
        stockMarket.setPrice(360.00f);
    }
}
