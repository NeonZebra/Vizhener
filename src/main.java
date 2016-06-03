import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5, 6, 6, 6};
        int[] b = {1, 1, 2, 1};
        SimpleCode sc = new SimpleCode();
        int[] c = sc.code(b, a);
        System.out.println(Arrays.toString(c));
        SimpleDecoder sd = new SimpleDecoder();
        int[] d = sd.decode(b, c);
        System.out.println(Arrays.toString(d));
    }
}
