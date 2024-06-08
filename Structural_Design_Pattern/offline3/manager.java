import java.util.ArrayList;

public class manager implements component{
    private String name;
    private String projectName;
    private ArrayList<component> developerList;

    public manager(String name, String projectName){
        this.name = name;
        this.projectName = projectName;
        developerList = new ArrayList<>();
    }

    public void add(component c){
        developerList.add(c);
    }

    public void remove(String name){
        for(component cm : developerList){
            if(cm.getName().equalsIgnoreCase(name)){
                if(cm.getSize()!=0){
                    System.out.println("Please Remove it's developers first");
                }
                else{
                    //System.out.print("eikhane?\n");
                    developerList.remove(cm);
                    break;
                }
            }
        }
    }

    public void print(){
        System.out.println("manager's Details:");
        System.out.println("Name: "+name+"\n"+"Role: "+"Project Manager\n"+"Current Project: "+projectName+"\n"+"Number of Supervisees: "+developerList.size());
        System.out.println();
    }

    public int getSize(){
        return developerList.size();
    }

    public String getName(){
        return name;
    }

    public String getProjectName(){
        return projectName;
    }

    public ArrayList<component> getList(){
        return developerList;
    }
}
