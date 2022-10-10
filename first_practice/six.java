
public class six {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            char dec = s.charAt(0);
            System.out.println("Знак ASCII будет " + (int) dec);
        }


    }
}
