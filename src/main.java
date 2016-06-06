import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Write your key: ");
        String a = scan.nextLine();

        System.out.print("Write your message: ");
        String b = scan.nextLine();

        NewCoder sc = new NewCoder();
        String h = sc.code(a, b);
        System.out.print("Your coded message: " + h);

        System.out.println();

        NewCoder sd = new NewCoder();
        String v = sd.decode(a, h);
        //System.out.println(Arrays.toString(d));

        System.out.print("Your decoded message: " + v);
    }
}
