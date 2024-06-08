import java.util.ArrayList;

public interface component {
    
    public void add(component c);
    public void remove(String name);
    public int getSize();
    public String getName();
    public ArrayList<component> getList();
    public String getProjectName();
    public void print();
}
