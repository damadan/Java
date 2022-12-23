import java.util.Scanner;
import java.util.regex.Pattern;

public class Order {
    private static final Pattern innPatter = Pattern.compile("\\d{10}|\\d{12}");
    public static boolean isValidINN(String inn) {
        inn = inn.trim();
        return innPatter.matcher(inn).matches();
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("name: ");
        String name = scan.next();
        System.out.println("inn: ");
        String inn = scan.next(); // 1849284914 123456789143
        try {
            boolean ans = isValidINN(inn);
            if (ans)
                System.out.println("shop accept");
            else throw new ArithmeticException();

        }
        catch(ArithmeticException ignored){
            System.out.println("wrong inn");
        }
    }
}
