public class HDDdrive implements components {
    private double price;
    private String name;
    private String size;

    public HDDdrive(String name, double price , String size){
        this.name = name;
        this.price = price;
        this.size = size;

    }
    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
    public String getSize(){
        return size;
    }
}