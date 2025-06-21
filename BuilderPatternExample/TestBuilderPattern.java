public class TestBuilderPattern {
    public static void main(String[] args) {
        // Basic computer
        Computer basic = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("4GB")
                .setStorage("256GB SSD")
                .build();

        // Gaming computer
        Computer gaming = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphics("NVIDIA RTX 4080")
                .build();

        // Workstation
        Computer workstation = new Computer.Builder()
                .setCPU("AMD Ryzen 9")
                .setRAM("64GB")
                .setStorage("2TB SSD")
                .setGraphics("NVIDIA Quadro RTX")
                .build();

        // Display all
        System.out.println("Basic Configuration:");
        basic.displayConfig();

        System.out.println("Gaming Configuration:");
        gaming.displayConfig();

        System.out.println("Workstation Configuration:");
        workstation.displayConfig();
    }
}
