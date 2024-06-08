public class grinded_coffee_beans implements decorator{
    private int price;
    private String name;
    private decorator coffee;

    public grinded_coffee_beans(decorator coffee){
        this.coffee = coffee;
    }

    public int price(){
        return 30;
    }
    public String name(){
        return "grinded coffee beans";
    }
    public decorator getcoffee(){
        return coffee;
    }
}
