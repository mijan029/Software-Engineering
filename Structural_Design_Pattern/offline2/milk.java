public class milk implements decorator {
    private int price;
    private String name;
    private decorator coffee;

    public milk(decorator coffee){
        this.coffee = coffee;
    }

    public int price(){
        return 50;
    }
    public String name(){
        return "milk";
    }
    public decorator getcoffee(){
        return coffee;
    }
}
