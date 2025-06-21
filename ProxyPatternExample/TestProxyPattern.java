public class TestProxyPattern {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("flower.jpg");
        Image img2 = new ProxyImage("sunset.jpg");

        img1.display();  // Loads from remote
        img1.display();  // Uses cached

        img2.display();  // Loads from remote
        img2.display();  // Uses cached
    }
}
