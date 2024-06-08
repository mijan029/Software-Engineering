public class graphics_card implements components {
    private double price;
    private String name;
    private String memorySize;

    public graphics_card(String name, double price, String memorySize){
        this.name = name;
        this.price = price;
        this.memorySize = memorySize;
    }
    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getMemorySize(){
        return memorySize;
    }
}
