import java.util.Scanner;
import java.util.StringTokenizer;
public class main{

    public static String toLine(String s){
        StringTokenizer tokens = new StringTokenizer(s,"_");
        String target="";
        while (tokens.hasMoreTokens()) {
            target+=tokens.nextToken();
            if(tokens.hasMoreTokens()) target+=" ";
            
        }
        return target;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Action client = new Action();
        while(true){
            String str = sc.nextLine();
            StringTokenizer tokens = new StringTokenizer(str," ");
            
                String s = tokens.nextToken();
                if(s.equalsIgnoreCase("create")||s.equalsIgnoreCase("add")){
                    s = tokens.nextToken();
                    if(s.equalsIgnoreCase("company")){
                        client.makeCompany(toLine(tokens.nextToken()));
                    }
                    if(s.equalsIgnoreCase("manager")){
                        //System.out.print("dekhi ki hoy\n");
                        String s1 = tokens.nextToken();
                        tokens.nextToken();
                        client.addManager(toLine(s1),toLine(tokens.nextToken()));
                    }
                    if(s.equalsIgnoreCase("developer")){
                        String s1 = tokens.nextToken();
                        tokens.nextToken();
                        client.addDeveloper(toLine(s1),toLine(tokens.nextToken()));
                    }
                }

                if(s.equalsIgnoreCase("remove")){
                    s = tokens.nextToken();
                    if(s.equalsIgnoreCase("company")){
                        client.removeCompany(toLine(tokens.nextToken()));
                    }
                    if(s.equalsIgnoreCase("manager")){
                        client.removeManager(toLine(tokens.nextToken()));
                    }
                    if(s.equalsIgnoreCase("developer")){
                        client.removeDeveloper(toLine(tokens.nextToken()));
                    }
                }

                if(s.equalsIgnoreCase("print")){
                    s = tokens.nextToken();
                    if(s.equalsIgnoreCase("company")){
                        client.printCompany();
                    }
                    if(s.equalsIgnoreCase("manager")){
                        client.printManager(toLine(tokens.nextToken()));
                    }
                    if(s.equalsIgnoreCase("developer")){
                        client.printDeveloper(toLine(tokens.nextToken()));
                    }
                }


            

        }
    }

    
}