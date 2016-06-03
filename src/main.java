import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int[] a = {7, 2, 5, 8};
        int[] b = {1, 4, 8, 8};

        Scanner scan = new Scanner();

        String stri = scan.nextLine();

        SimpleTranslator st = new SimpleTranslator();

        System.out.println(Arrays.toString(st.StrToArr(stri)));
        System.out.println(st.ArrToStr(st.StrToArr(stri)));

        SimpleCode sc = new SimpleCode();
        int[] c = sc.code(b, a);
        System.out.println(Arrays.toString(c));

        SimpleDecoder sd = new SimpleDecoder();
        int[] d = sd.decode(b, c);
        System.out.println(Arrays.toString(d));
    }
}
