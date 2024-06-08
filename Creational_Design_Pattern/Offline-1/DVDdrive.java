public class DVDdrive implements components {
    private double price;
    private String name;

    public DVDdrive(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

}
