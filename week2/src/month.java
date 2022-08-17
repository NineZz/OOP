
import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        int salary;
        Scanner tube = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = tube.nextLine();
        System.out.print("Please insert your age : ");
        int age = tube.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = tube.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = tube.nextInt();
        System.out.print("Please insert your body weight : ");
        int weight = tube.nextInt();
        System.out.println("Hi, "+name);
        if(age>=21 && age<=30){
            salary = (numDay1 * 300) - (numDay2 * 50);
            System.out.println("Your salary is "+salary+" Baht");
            if(weight>=10 && weight<=60){
                salary+=5000;
                System.out.println("Your salary and bonus is "+salary+" Baht");
            }
            else if(weight>=61 && weight<=90){
                salary+=((500-weight-60)*10);
                System.out.println("Your salary and bonus is "+salary+" Baht");
            }
        }
        else if(age>=31 && age<=40){
            salary = (numDay1 * 500) - (numDay2 * 50);
            System.out.println("Your salary is "+salary+" Baht");
            if(weight>=10 && weight<=60){
                salary+=5000;
                System.out.println("Your salary and bonus is "+salary+" Baht");
            }
            else if(weight>=61 && weight<=90){
                salary+=((500-weight-60)*10);
                System.out.println("Your salary and bonus is "+salary+" Baht");
            }
        }
        else if(age>=41 && age<=50){
            salary = (numDay1 * 1000) - (numDay2 * 25);
            System.out.println("Your salary is "+salary+" Baht");
            if(weight>=10 && weight<=60){
                salary+=5000;
                System.out.println("Your salary and bonus is "+salary+" Baht");
            }
            else if(weight>=61 && weight<=90){
                salary+=((500-weight-60)*10);
                System.out.println("Your salary and bonus is "+salary+" Baht");
            }
        }
        else if(age>=51 && age<=60){
            salary = (numDay1 * 3000);
            System.out.println("Your salary is "+salary+" Baht");
            if(weight>=10 && weight<=60){
                salary+=5000;
                System.out.println("Your salary and bonus is "+salary+" Baht");
            }
            else if(weight>=61 && weight<=90){
                salary+=((500-weight-60)*10);
                System.out.println("Your salary and bonus is "+salary+" Baht");
            }
        }
}
}
