import java.util.Scanner;
public class money {
    public static void main(String[] args) {
        Scanner tube = new Scanner(System.in);
        System.out.println("Input your money : ");
        int cash = tube.nextInt();
        System.out.println("Input your account type(Please type A B C or X in uppercase) : ");
        char n1 = tube.next().charAt(0);
        if(n1 == 'A'){
            System.out.println("Your total money in one year = "+(cash*1.015f));
        }
        if(n1 == 'B'){
            System.out.println("Your total money in one year = "+(cash*1.02f));
        }
        if(n1 == 'C'){
            System.out.println("Your total money in one year = "+(cash*1.015f));
        }
        if(n1 == 'X'){
            System.out.println("Your total money in one year = "+(cash*1.05f));
        }
    }
}
