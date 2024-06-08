public class dairy_cream implements decorator{
    private int price;
    private String name;
    private decorator coffee;

    public dairy_cream(decorator coffee){
        this.coffee = coffee;
    }

    public int price(){
        return 40;
    }
    public String name(){
        return "dairy cream";
    }
    public decorator getcoffee(){
        return coffee;
    }
}
