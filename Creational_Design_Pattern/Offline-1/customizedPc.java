import java.util.ArrayList;

public class customizedPc {
    private String name;
    private ArrayList<pair> pc = new ArrayList<>();

    public customizedPc(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double getTotalPrice(){
        double price=0;
        for (int i = 0; i < pc.size(); i++) {
            price+=pc.get(i).getFirst().getPrice();
          }
          return price;
    }

    public void add(components cmp, String type){
        pc.add(new pair(cmp, type));
    }
    public void show(){
        System.out.println("Name of the pc: " + name);
        for (int i = 0; i < pc.size(); i++) {
            System.out.println(pc.get(i).getFirst().getName() + "\t" + pc.get(i).getSecond() + "\t" + pc.get(i).getFirst().getPrice()+" BDT");
          }
        System.out.println("Total price for your pc is: " + getTotalPrice());
        System.out.println("\n\n\n");
    }
}
