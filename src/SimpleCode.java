import java.util.ArrayList;

public class SimpleCode {
    public int[] code(int[] key, int[] message){
        int[] coded = new int[message.length];
            for(int i = 0; i < (message.length / key.length); i++){
                for(int j = 0; j < key.length; j++){
                    int y = message[(key.length * i) + j];
                    int x = key[j];
                    coded[(key.length * i) + j] = (x + y)*x;
                }
            }
        return(coded);
    }
}
