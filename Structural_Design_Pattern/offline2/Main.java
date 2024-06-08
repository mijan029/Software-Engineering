import java.util.Scanner;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer coffees = new StringTokenizer(str," ");
        int totalPrice=0;
        while (coffees.hasMoreTokens()) {
              coffee cf = new coffee();
              String s = coffees.nextToken();
              cf.makeCoffee(s);
              System.out.println(s.toUpperCase()+":");
              totalPrice+=cf.print();
        }
        System.out.println("Total Price : "+totalPrice);
        System.out.println();
    }
}