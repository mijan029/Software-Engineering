import java.util.ArrayList;

public class Action {
    private component company;
    public Action(){
        company = null;
    }
    public void makeCompany(String name){
        company = new company(name);
    }

    public void addManager(String name, String projectName){
        if(company==null){
            System.out.println("Please Create a company First");
        }
        else{
            company.add(new manager(name, projectName));
        }
    }

    public void addDeveloper(String name, String managerName){
        ArrayList<component> cm = company.getList();
        boolean flag=false;
        for(component c : cm){
            if(c.getName().equalsIgnoreCase(managerName)){
                c.add(new developer(name, c.getProjectName()));
                flag = true;
                break;
            }
        }
        if(!flag){
            if(company == null) System.out.println("Please Create a company First");
            else System.out.println("No such manager");
        }
    }

    public void removeCompany(String name){
        if(company.getList().size()!=0){
            System.out.println("Please remove all projects first");
        }
        else{
            company = null;
        }
    }

    public void removeManager(String name){
        company.remove(name);
    }

    public void removeDeveloper(String name){
        ArrayList<component> cm = company.getList();
        for(component c : cm){
            c.remove(name);
        }
    }

    public void printCompany(){
        if(company == null) System.out.println("There is no company!");
        else
            company.print();
    }

    public void printManager(String name){
        ArrayList<component> cm = company.getList();
        for(component c : cm){
            if(name.equalsIgnoreCase(c.getName())){
                c.print();
            }
        }
    }

    public void printDeveloper(String name){
        ArrayList<component> cm = company.getList();
        for(component c : cm){
            ArrayList<component> devOfM = c.getList();
            for(component d : devOfM){
                if(name.equalsIgnoreCase(d.getName())){
                    d.print();
                }
            }
        }
    }




}
