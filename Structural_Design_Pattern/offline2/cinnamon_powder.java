public class cinnamon_powder implements decorator {
    private int price;
    private String name;
    private decorator coffee;

    public cinnamon_powder(decorator coffee){
        this.coffee = coffee;
    }

    public int price(){
        return 50;
    }
    public String name(){
        return "cinnamon powder";
    }
    public decorator getcoffee(){
        return coffee;
    }
}
