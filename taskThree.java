import java.util.Scanner;

public class taskThree {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char answer = 'Y';
        do {
            System.out.print("Enter number A:");
            float A = object.nextFloat();
            if ((A > 10) && (A % 3 == 0) && (A <= 10000)) {
                System.out.print("Type the value of B:");
                float B = object.nextFloat();
                if (A > B) {
                    float C = A + B;
                    System.out.println("Result is:" + C);
                    System.out.println("Would you like to start again (Y-yes)(N-no)?");
                    System.out.print("Answer:");
                    answer=object.next().charAt(0);
                } else if (B > A) {
                    float C = B - A;
                    System.out.println("Result is:" + C);
                    System.out.println("Would you like to start again (Y-yes)(N-no)?");
                    System.out.print("Answer:");
                    answer=object.next().charAt(0);
                } else {
                    float C = A * B;
                    System.out.println("Result is:" + C);
                    System.out.println("Would you like to start again (Y-yes)(N-no)?");
                    System.out.print("Answer:");
                    answer=object.next().charAt(0);
                }
            } else {
                System.out.println("A is not valid!");
                System.out.println("Would you like to enter A again (Y-yes)(N-no)?");
                System.out.print("Answer:");
                answer=object.next().charAt(0);
            }

        }while((answer=='Y')||(answer=='y'));
    }
}
