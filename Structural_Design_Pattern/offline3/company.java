import java.util.ArrayList;

public class company implements component{
    private String name;
    private ArrayList<component> managerList;

    public company(String name){
        this.name = name;
        managerList = new ArrayList<>();
    }

    public void add(component c){
        managerList.add(c);
    }

    public void remove(String name){
        for(component cm : managerList){
            if(cm.getName().equalsIgnoreCase(name)){
                if(cm.getSize()!=0){
                    System.out.println("Please Remove it's developers first");
                }
                else{
                    managerList.remove(cm);
                    break;
                }
            }
        }

    }

    public void print(){
        System.out.println("Company's hierarchy:");
        System.out.println("-"+name);
        for(component m : managerList){
            System.out.println("  -"+m.getName()+"("+m.getProjectName()+")");
            ArrayList<component> devOfM = m.getList();
            for(component d : devOfM){
                System.out.println("    -"+d.getName());
            }
        }
        System.out.println();
    } 

    public int getSize(){
        return managerList.size();
    }

    public String getName(){
        return name;
    }
    public ArrayList<component> getList(){
        return managerList;
    }
    public String getProjectName(){
        return "nothing";
    }
}
