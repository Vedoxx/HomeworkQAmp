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
                if(B==0)
                {
                    System.out.println("Undefined");
                }
                else if (A%B==0){
                    System.out.println("A is divisible with number B");
                }
                else if(A%B!=0)
                {
                    System.out.println("A is not divisible with number B");
                }
            }
            else{
                System.out.println("A is not valid");
            }
            System.out.println("Would you like to start again (Y-yes)(N-no)?");
            System.out.print("Answer:");
            answer=object.next().charAt(0);

        }while((answer=='Y')||(answer=='y'));
    }
}
