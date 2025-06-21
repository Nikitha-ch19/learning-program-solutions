public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    public void update(float price) {
        System.out.println("Web App " + name + ": New stock price is ₹" + price);
    }
}
