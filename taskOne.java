import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        char answer='Y';
        do {
            System.out.println("Your cash register is empty!");
            System.out.print("Enter number of 20KM bills:");
            int twentyKM = object.nextInt();
            System.out.print("Enter number of 10KM bills:");
            int tenKM = object.nextInt();
            System.out.print("Enter number of 2KM bills:");
            int twoKM = object.nextInt();
            System.out.print("Enter number of 1KM bills:");
            int oneKM = object.nextInt();
            System.out.print("Enter number of 0.5KM bills:");
            float halfKM = object.nextInt();
            System.out.print("Enter number of 0.20KM bills:");
            float twentyCent = object.nextInt();
            System.out.print("Enter number of 0.10KM bills:");
            float tenyCent = object.nextInt();
            System.out.print("Enter number of 0.01KM bills:");
            float oneCent = object.nextInt();
            float totalSum = (float) ((20 * twentyKM) + (10 * tenKM) + (2 * twoKM) + (oneKM) + (0.5 * halfKM) + (0.20 * twentyCent) + (0.10 * tenyCent) + (0.01 * oneCent));
            System.out.print("Cash register total:");
            System.out.println(totalSum);
            System.out.print("Enter customer money:");
            float customerMoney = object.nextFloat();
            if (customerMoney > 100) {
                System.out.println("Too much money");
            } else if (customerMoney == 0) {
                System.out.println("You didn't buy anything did you");
            } else if (customerMoney < 0) {
                System.out.println("Did you maybe break something?");
            } else {
                System.out.print("Enter customer bill:");
                float customerBill = object.nextFloat();
                if (customerBill > customerMoney) {
                    System.out.println("Not enough money");
                } else if (customerBill == customerMoney) {
                    System.out.println("Taman");
                    System.out.println("Nema kusura");
                } else {
                    float customerChange = customerMoney - customerBill;
                    System.out.println("Change=" + customerChange);
                    int temp = (int) customerChange / 20;
                    if (temp > twentyKM) {
                        System.out.println("20KM=" + twentyKM);
                        temp = twentyKM;
                        twentyKM = 0;
                        System.out.println("No 20KM bills remaining.");
                    } else if (temp < twentyKM) {
                        twentyKM = twentyKM - temp;
                        System.out.println("20KM=" + temp);
                        System.out.println("20KM bill remaining=" + twentyKM);
                    } else if (temp == twentyKM) {
                        twentyKM = 0;
                        System.out.println("20KM=" + temp);
                        System.out.println("No 20KM bills remaining.");
                    }
                    customerChange = customerChange - (20 * temp);
                    System.out.println("Change:" + customerChange);
                    int temp2 = (int) customerChange / 10;
                    if (temp2 > tenKM) {
                        System.out.println("10KM=" + tenKM);
                        temp2 = tenKM;
                        tenKM = 0;
                        System.out.println("No 10KM bills remaining.");
                    } else if (temp2 < tenKM) {
                        tenKM = tenKM - temp2;
                        System.out.println("10KM=" + temp2);
                        System.out.println("10KM bill remaining=" + tenKM);
                    } else if (temp2 == tenKM) {
                        tenKM = 0;
                        System.out.println("10KM=" + temp2);
                        System.out.println("No 10KM bills remaining.");
                    }
                    customerChange = customerChange - (10 * temp2);
                    System.out.println("Change:" + customerChange);
                    int temp3 = (int) customerChange / 2;
                    if (temp3 > twoKM) {
                        System.out.println("2KM=" + twoKM);
                        temp3 = twoKM;
                        twoKM = 0;
                        System.out.println("No 2KM bills remaining.");
                    } else if (temp3 < twoKM) {
                        twoKM = twoKM - temp3;
                        System.out.println("2KM=" + temp3);
                        System.out.println("2KM bill remaining=" + twoKM);
                    } else if (temp3 == twoKM) {
                        twoKM = 0;
                        System.out.println("2KM=" + temp3);
                        System.out.println("No 2KM bills remaining.");
                    }
                    customerChange = customerChange - (2 * temp3);
                    System.out.println("Change:" + customerChange);
                    int temp4 = (int) customerChange / 1;
                    if (temp4 > oneKM) {
                        System.out.println("1KM=" + oneKM);
                        temp4 = oneKM;
                        oneKM = 0;
                        System.out.println("No 1KM bills remaining.");
                    } else if (temp4 < oneKM) {
                        oneKM = oneKM - temp4;
                        System.out.println("1KM=" + temp4);
                        System.out.println("1KM bill remaining=" + oneKM);
                    } else if (temp4 == oneKM) {
                        oneKM = 0;
                        System.out.println("1KM=" + temp4);
                        System.out.println("No 1KM bills remaining.");
                    }
                    customerChange = customerChange - (1 * temp4);
                    System.out.println("Change:" + customerChange);
                    int temp5 = (int) (customerChange / 0.5);
                    if (temp5 > halfKM) {
                        System.out.println("0.5KM=" + halfKM);
                        temp5 = (int) halfKM;
                        halfKM = 0;
                        System.out.println("No 0.5KM bills remaining.");
                    } else if (temp5 < halfKM) {
                        halfKM = halfKM - temp5;
                        System.out.println("0.5KM=" + temp5);
                        System.out.println("0.5KM bill remaining=" + halfKM);
                    } else if (temp5 == halfKM) {
                        halfKM = 0;
                        System.out.println("0.5KM=" + temp5);
                        System.out.println("No 0.5KM bills remaining.");
                    }
                    customerChange = (float) (customerChange - (0.5 * temp5));
                    System.out.println("Change:" + customerChange);
                    int temp6 = (int) (customerChange / 0.20);
                    if (temp6 > twentyCent) {
                        System.out.println("0.20KM=" + twentyCent);
                        temp6 = (int) twentyCent;
                        twentyCent = 0;
                        System.out.println("No 0.20KM bills remaining.");
                    } else if (temp6 < twentyCent) {
                        twentyCent = twentyCent - temp6;
                        System.out.println("0.20KM=" + temp6);
                        System.out.println("0.20KM bill remaining=" + twentyCent);
                    } else if (temp6 == twentyCent) {
                        twentyCent = 0;
                        System.out.println("0.20KM=" + temp6);
                        System.out.println("No 0.20KM bills remaining.");
                    }
                    customerChange = (float) (customerChange - (0.20 * temp6));
                    System.out.println("Change:" + customerChange);
                    int temp7 = (int) (customerChange / 0.10);
                    if (temp7 > tenyCent) {
                        System.out.println("0.10KM=" + tenyCent);
                        temp7 = (int) tenyCent;
                        tenyCent = 0;
                        System.out.println("No 0.10KM bills remaining.");
                    } else if (temp7 < tenyCent) {
                        tenyCent = tenyCent - temp7;
                        System.out.println("0.10KM=" + temp7);
                        System.out.println("0.10KM bill remaining=" + tenyCent);
                    } else if (temp7 == tenyCent) {
                        tenyCent = 0;
                        System.out.println("0.10KM=" + temp7);
                        System.out.println("No 0.10KM bills remaining.");
                    }
                    customerChange = (float) (customerChange - (0.10 * temp7));
                    System.out.println("Change:" + customerChange);
                    int temp8 = (int) (customerChange / 0.01);
                    if (temp8 > oneCent) {
                        System.out.println("0.01KM=" + oneCent);
                        temp8 = (int) oneCent;
                        oneCent = 0;
                        System.out.println("No 0.01KM bills remaining.");
                    } else if (temp8 < oneCent) {
                        oneCent = oneCent - temp8;
                        System.out.println("0.01KM=" + temp8);
                        System.out.println("0.01KM bill remaining=" + oneCent);
                    } else if (temp8 == oneCent) {
                        oneCent = 0;
                        System.out.println("0.01KM=" + temp8);
                        System.out.println("No 0.01KM bills remaining.");
                    }
                    customerChange = (float) (customerChange - (0.01 * temp8));
                    System.out.println("Change:" + customerChange);
                    if (customerChange > 0) {
                        System.out.println("We don't have change left sir");
                    } else if (customerChange == 0) {
                        System.out.println("Thank you for your purchase");
                    } else {
                        System.out.println("E ovo je vec problem...");
                    }

                }
            }
            System.out.println("Would you like to enter A again (Y-yes)(N-no)?");
            System.out.print("Answer:");
            answer=object.next().charAt(0);
        }while((answer=='y')||(answer=='Y'));
    }
}
