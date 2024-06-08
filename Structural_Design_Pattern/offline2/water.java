public class water implements decorator {
    private int price;
    private String name;
    private decorator coffee;

    public water(decorator coffee){
        this.coffee = coffee;
    }

    public int price(){
        return 0;
    }
    public String name(){
        return "water";
    }
    public decorator getcoffee(){
        return coffee;
    }
}

