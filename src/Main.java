import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter temperature");
        int temperature = sc.nextInt();
        if ((age > 20 || age < 45) && (temperature < -20 || temperature > 30 )) {
            System.out.println("Не выходит гулять");
        } else if ((age < 20) && (temperature > 0 || temperature < 28)) {
            System.out.println("Не выходит гулять");
        } else if ((age > 45) && (temperature > -10 || temperature < 25)) {
            System.out.println("Не выходит гулять");
        } else {
            System.out.println("Идет бухать!");
        }

    }
}
