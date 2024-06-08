import java.util.ArrayList;

public class developer implements component{
    private String name;
    private String projectName;
    private ArrayList<component> empty;

    public developer(String name, String projectName){
        this.name = name;
        this.projectName = projectName;
        empty = new ArrayList<>();
    }

    public void add(component c){

    }

    public void remove(String name){
        
    }

    public void print(){
        System.out.println("Developer's Details:");
        System.out.println("Name: "+name+"\n"+"Role: "+"Developer\n"+"Current Project: "+projectName);
        System.out.println();
    }

    public int getSize(){
        return empty.size();
    }

    public String getName(){
        return name;
    }
    public ArrayList<component> getList(){
        return empty;
    }
    public String getProjectName(){
        return projectName;
    }
}
