import java.util.Scanner;

public class director {
    public director(){
        
    }

    public int itemnumber(int check){
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            String s =  sc.next(); 
            if(s.equalsIgnoreCase("E")){
                if(check == 1) return 5;
                System.out.println("Please choose one");
            }
            else if(s.equalsIgnoreCase("O")){
              System.out.println("Want to add something?");
            }
            else {
              n = Integer.parseInt(s);
              break;
            }
          }
          
          return n;
    }
    public customizedPc newCustomer(builder eibuilder){
        System.out.println("Enter which pc would you want to buy");
        System.out.println("1.Gaming pc\n"+
                            "2.11th generation intel processor Corei5\n" +
                            "3.11th generation intel processor Corei7\n" +
                            "4.11th generation intel processor Corei9"
                            );
        int n ;
        n = itemnumber(0);
        customizedPc pc;
        if(n==1){
            pc = eibuilder.makeGamingPc();
        }
        else if(n==2){
            pc = eibuilder.makeCorei5Pc();
        }
        else if(n==3){
            pc = eibuilder.makeCorei7Pc();
        }
        else{
            pc = eibuilder.makeCorei9Pc();
        }


        while(true){
            System.out.println("You can add more components!");
            System.out.println("Graphics card\n"+
                                "1. 2GB 6500 BDT\n"+
                                "2. 4GB 7600 BDT\n"+
                                "DDR4 RAM\n"+
                                "3. 8 GB DDR4 RAM 2666 MHz 2620 BDT\n"+
                                "4. 8 GB DDR4 RAM 3200 MHz 2950 BDT\n"+
                                "5.Not Interested");
            n = itemnumber(1);

            if(n==1){
                pc = eibuilder.addGraphicsCard(pc, 1);
            }
            else if(n==2){
                pc = eibuilder.addGraphicsCard(pc, 2);
            }
            else if(n==3){
                pc = eibuilder.addRAM(pc, 1);
            }
            else if(n==4){
                pc = eibuilder.addRAM(pc, 2);
            }
            else {
                break;
            }
        }
        return pc;
    }

}
