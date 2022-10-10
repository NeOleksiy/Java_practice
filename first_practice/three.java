import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner int1 = new Scanner(System.in);
        Scanner int2 = new Scanner(System.in);
        Scanner int3 = new Scanner(System.in);

        int chickens;
        System.out.print("enter the number of chickens ");
        chickens = int1.nextInt();

        int cows;
        System.out.print("enter the number of cows ");
        cows = int2.nextInt();

        int pigs;
        System.out.print("enter the number of pigs ");
        pigs = int3.nextInt();

        int result = (pigs*4)+(chickens*2)+(cows*4);
        System.out.println(result + " ног");
}
}
