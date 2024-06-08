public class cpu_cooler implements components {
    private double price;
    private String name;
    private String type;

    public cpu_cooler(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

}