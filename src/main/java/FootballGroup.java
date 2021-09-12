import java.util.Scanner;

public class FootballGroup {
    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        System.out.println(" Please enter your age: \n");
        int age = userName.nextInt();

        if (age <= 20) {
            System.out.println("you are on children's group");
        }
        else if (age > 20 && age < 40) {
            System.out.println("you are on Young mens group");
        }
        else if (age >= 40) {
            System.out.println("you are on Old mens group");
        }
    }
}