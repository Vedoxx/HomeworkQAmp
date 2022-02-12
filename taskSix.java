import java.util.Scanner;

public class taskSix {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char answer = 'Y';
        do {
            System.out.print("Type number A:");
            int A = object.nextInt();
            System.out.print("Type number B:");
            int B = object.nextInt();
            System.out.print("Type number C:");
            int C = object.nextInt();
            System.out.print("Type number D:");
            int D = object.nextInt();
             if((A>0)&&(B>0)&&(C>0)&&(D>0)) {
                System.out.println("The condition did not pass");
                System.out.println("Would you like to enter A again (Y-yes)(N-no)?");
                System.out.print("Answer:");
                answer = object.next().charAt(0);
            }
            else if((A>0 && B>0) || (C>0 && D>0)) {
                int result = A + B + C + D;
                 if(result<100) {
                     System.out.println("Result is not bigger than 100");
                     System.out.println("Would you like to enter A again (Y-yes)(N-no)?");
                     System.out.print("Answer:");
                     answer = object.next().charAt(0);
                 }
                 else if ((result > 100) && (result % 2 == 0)) {
                    int result2 = result / 2;
                    System.out.println("Result:" + result2);
                    System.out.println("Would you like to enter A again (Y-yes)(N-no)?");
                    System.out.print("Answer:");
                    answer = object.next().charAt(0);
                } else if (result % 2 != 0) {
                    result = result - 1;
                    if (result % 2 == 0) {
                        result = result / 2;
                        System.out.println("Result:" + result);
                        System.out.println("Would you like to enter A again (Y-yes)(N-no)?");
                        System.out.print("Answer:");
                        answer = object.next().charAt(0);
                    } else System.out.println("The number is still not divisible by 2");
                }
            }
        }while((answer=='y')||(answer=='Y'));
    }
}
