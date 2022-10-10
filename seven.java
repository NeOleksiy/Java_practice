import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner int1 = new Scanner(System.in);
        int num = int1.nextInt();
        int sum = 0;
        for (int i=0;i<=num;i++) {
            sum += i;
        }
        System.out.println("сумма чисел до этого числа равна " + sum);






    }
}