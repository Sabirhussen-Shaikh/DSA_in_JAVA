
import java.util.Scanner;

public class B_input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter radius of circle to calculate area");
            int radius = sc.nextInt();
            double pi = 3.1415;

            double circleArea = pi*radius*radius;
            System.out.println("area of circle : " + circleArea);
        }
    }
}
