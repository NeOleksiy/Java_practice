import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner int1 = new Scanner(System.in);
        Scanner int2 = new Scanner(System.in);
        Scanner int3 = new Scanner(System.in);

        int res;
        System.out.print("enter the number of result ");
        res = int1.nextInt();

        int num1;
        System.out.print("enter the first number ");
        num1 = int2.nextInt();

        int num2;
        System.out.print("enter the second number ");
        num2 = int3.nextInt();

        if (num1 + num2 == res)
            System.out.println("Added");
        else if (num1 - num2 == res)
            System.out.println("Subtracted");
        else if (num1 * num2 == res)
            System.out.println("multiplication");
        else
            System.out.println("None");

    }
}
