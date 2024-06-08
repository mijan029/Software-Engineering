public class motherboard implements components {
    private double price;
    private String name;
    

    public motherboard(String name, double price){
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