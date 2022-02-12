import java.util.Scanner;

public class taskFour {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        char answer = 'Y';
        do {
            System.out.print("Enter number A:");
            float A = object.nextInt();
            System.out.print("Enter number B:");
            float B = object.nextInt();
            if (A > B) {
                float C = A + B;
                System.out.println("Result is:" + C);
                System.out.println("Would you like to start again (Y-yes)(N-no)?");
                System.out.print("Answer:");
                answer = object.next().charAt(0);
            } else if (B > A) {
                float C = B - A;
                System.out.println("Result is:" + C);
                System.out.println("Would you like to start again (Y-yes)(N-no)?");
                System.out.print("Answer:");
                answer = object.next().charAt(0);
            } else {
                float C = A * B;
                System.out.println("Result is:" + C);
                System.out.println("Would you like to start again (Y-yes)(N-no)?");
                System.out.print("Answer:");
                answer = object.next().charAt(0);
            }
        } while ((answer == 'Y') || (answer == 'y'));
    }
}
