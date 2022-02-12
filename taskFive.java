import java.util.Scanner;

//Problem x+x+6/(2-x)

 public class taskFive {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char answer = 'Y';
        do {
            System.out.print("Type the value of x:");
            int x = object.nextInt();
            int result = x + x + 6 / (2 - x);
            System.out.print("Result:");
            System.out.println(result);
            if (result % 2 == 0) {
                System.out.println("Result is divisible by 2");
                System.out.println("Would you like to start again (Y-yes)(N-no)?");
                System.out.print("Answer:");
                answer = object.next().charAt(0);
            } else {
                System.out.println("Result is not divisible by 2");
                System.out.println("Would you like to start again (Y-yes)(N-no)?");
                System.out.print("Answer:");
                answer = object.next().charAt(0);
            }
        }while((answer=='Y')||(answer=='y'));
    }
}



