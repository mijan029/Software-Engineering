public class RAM implements components {
    private double price;
    private String name;
    private int frequency;

    public RAM(String name, double price, int frequency){
        this.name = name;
        this.price = price;
        this.frequency = frequency;
    }
    public double getPrice()
    {
        return price;
    }

    public String getName(){
        return name;
    }

    public int getFrequency(){
        return frequency;
    }
}

