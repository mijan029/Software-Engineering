public class chocolate_sauce implements decorator{
    private int price;
    private String name;
    private decorator coffee;

    public chocolate_sauce(decorator coffee){
        this.coffee = coffee;
    }

    public int price(){
        return 60;
    }
    public String name(){
        return "chocolate sauce";
    }
    public decorator getcoffee(){
        return coffee;
    }
}
