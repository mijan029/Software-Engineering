import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter O to buy a pc or Enter any other key to exit");
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("O")){
                builder bldr = new builder();
                director dr = new director();
                customizedPc pc = dr.newCustomer(bldr);
                System.out.println("Your pc component's are:\n");
                pc.show();
            }
            else {
                break;
            }
        }
    }
}
