public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    public void update(float price) {
        System.out.println("Mobile App " + name + ": New stock price is ₹" + price);
    }
}
