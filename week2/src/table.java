
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner tube = new Scanner(System.in);
        System.out.println("กรุณาระบุความสูงตึก : ");
        int height = tube.nextInt();
        for(int count = 0; count < height; count++){
            System.out.println("#-#-#-#-#");
        }
    }
}
