import java.util.Scanner;


public class taskTwo {
  static double areaCircle(double radius){
      double areaOfCircle;
      areaOfCircle=Math.PI * radius * radius;
      return areaOfCircle;
    }

    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        char answer;
        do {
            System.out.print("Enter radius of a circle:");
            double radius = object.nextDouble();
            if (radius <= 0) {
                System.out.println("Malo pozitivnije :)");
            }
            double result = areaCircle(radius);
            System.out.println("Result is:" + result);
            System.out.println("Would you like to calculate circle area again? (Y-yes)(N-no)");
            System.out.print("Answer:");
            answer=object.next().charAt(0);
        }while((answer=='Y')||(answer=='y'));
    }
}
