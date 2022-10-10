import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner int1 = new Scanner(System.in);
        Scanner int2 = new Scanner(System.in);
        int result = int1.nextInt()+int2.nextInt()-1;
        System.out.println("Максимальная сторона треуголника"+ result);
    }
}
