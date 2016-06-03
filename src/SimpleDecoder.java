public class SimpleDecoder {
    public int[] decode(int[] key, int[] coded){
        int[] decoded = new int[coded.length];
        for(int i = 0; i < (coded.length / key.length); i++){
            for(int j = 0; j < key.length; j++){
                int y = coded[(key.length * i) + j];
                int x = key[j];
                decoded[(key.length * i) + j] = y/x - x;
            }
        }
        return(decoded);
    }
}
