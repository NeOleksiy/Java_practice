import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        Scanner int1 = new Scanner(System.in);
        Scanner int2 = new Scanner(System.in);
        Scanner int3 = new Scanner(System.in);

        int num1;
        System.out.print("enter the first number ");
        num1 = int1.nextInt();

        int num2;
        System.out.print("enter the second number ");
        num2 = int2.nextInt();

        int num3;
        System.out.print("enter the third number ");
        num3 = int3.nextInt();

        int result = (num1 * num1 * num1) + (num2 * num2 * num2) + (num3 * num3 * num3);
        System.out.println(result + " - сумма кубов");
    }
}