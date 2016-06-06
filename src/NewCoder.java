public class NewCoder {
    public String IntArrayToString(int[] a){
        char[] tmp = new char[a.length];
        for (int i = 0; i < a.length; i++){
            tmp[i] = (char)a[i];
        }
        String ans = new String(tmp);
        return(ans);
    }
    public int[] StringToIntArray(String s){
        int[] ans = new int[s.length()];
        char[] p = new char[s.length()];

        s.getChars(0, s.length(), p, 0);
        for(int i = 0; i < p.length; i++){
            ans[i] = ((int)p[i]);
        }
        return(ans);
    }
    public String code(String skey, String smessage){

        //перевод строк в массив интов
        if (!skey.equals("")) {

            NewCoder nc = new NewCoder();
            int[] key = nc.StringToIntArray(skey);
            int[] message = nc.StringToIntArray(smessage);

            int[] coded = new int[message.length];
            for (int i = 0; i < message.length; i++) {
                coded[i] = (message[i] + key[i % key.length] - 128) * (key[i % key.length] - 64);
            }

            return (nc.IntArrayToString(coded));
        }
        else {
            return(smessage);
        }
    }
    public String decode(String skey, String scoded){

        if (!skey.equals("")){

            NewCoder nc = new NewCoder();
            int[] key = nc.StringToIntArray(skey);
            int[] coded = nc.StringToIntArray(scoded);
            int[] decoded = new int[scoded.length()];

            for (int i = 0; i < coded.length; i++){
                decoded[i] = coded[i]/ (key[i % key.length] - 64) + 128 - key[i % key.length];
            }

            return (nc.IntArrayToString(decoded));

        }
        else {
            return(scoded);
        }
    }
}

