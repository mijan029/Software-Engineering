public class mug implements decorator {
    private int price;
    private String name;
    private decorator coffee;

    public mug(){
        coffee = null;
    }
    public int price(){
        return 100;
    }
    public String name(){
        return "mug";
    }
    public decorator getcoffee(){
        return coffee;
    }
}
