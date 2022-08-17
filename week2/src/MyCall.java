import java.util.Scanner;
public class MyCall {
    public static void main(String[] args) {
        double salary;
        Scanner tube = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        salary = tube.nextDouble();
        if(salary > 50000){
            System.out.println(salary*0.1);
        }
        else if(salary <= 50000){
            System.out.println(salary*0.05);
        }
    }
}
