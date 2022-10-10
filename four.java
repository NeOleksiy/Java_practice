import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner int1 = new Scanner(System.in);
        Scanner int2 = new Scanner(System.in);
        Scanner int3 = new Scanner(System.in);

        float prob;
        System.out.print("enter the number of prob ");
        prob = int1.nextFloat();

        float prize;
        System.out.print("enter the number of prize ");
        prize = int2.nextFloat();

        float pay;
        System.out.print("enter the number of pay ");
        pay = int3.nextFloat();

        if (prob * prize > pay)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
