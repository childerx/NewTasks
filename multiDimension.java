import java.util.Scanner;

public class multiDimension {
    public static void main(String[] args) {
        System.out.print("Input your age here: ");
       // Scanner input = new Scanner(System.in);
        ages();

    }
    static void ages() {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

            if (age > 1) {
                int newA = age + 5;
                System.out.println("Your age was increased by 5 which gives you " + newA + " as your new age.");
            } else {
                System.out.println("Error input");
            }





    }
}
