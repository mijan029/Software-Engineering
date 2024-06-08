import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a continental area");
        String str = sc.next();
        car_factory cf = new car_factory(str);
        car c = cf.getCar();
        c.showinfo();
    }
}
