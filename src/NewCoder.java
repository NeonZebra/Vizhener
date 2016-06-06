public class NewCoder {
    public String code(String skey, String smessage){

        //перевод строк в массив интов
        if (!skey.equals("")){
            int[] key = new int[skey.length()];
            char[] p = new char[skey.length()];

            skey.getChars(0, skey.length(), p, 0);
            for(int j = 0; j < p.length; j++){
                key[j] = ((int)p[j]);
            }

            int[] message = new int[smessage.length()];
            char[] k = new char[smessage.length()];

            smessage.getChars(0, smessage.length(), k, 0);
            for(int l = 0; l < k.length; l++){
                message[l] = (int)k[l];
            }

            int[] coded = new int[message.length];
            for (int i = 0; i < message.length; i++){
                coded[i] = (message[i] + key[i % key.length] - 128)*(key[i % key.length] - 64);
            }

            //перевод массива интов в строку

            char[] ccoded = new char[coded.length];
            for (int i = 0; i < coded.length; i++){
                ccoded[i] = (char)coded[i];
            }
            String ans = new String(ccoded);
            return(ans);}
        else {
            return(smessage);
        }
    }
    public String decode(String skey, String scoded){

        //перевод строк в массив интов
        if (!skey.equals("")){
            int[] key = new int[skey.length()];
            char[] p = new char[skey.length()];

            skey.getChars(0, skey.length(), p, 0);
            for(int i = 0; i < p.length; i++){
                key[i] = ((int)p[i]);
            }

            int[] coded = new int[scoded.length()];
            char[] k = new char[scoded.length()];

            scoded.getChars(0, scoded.length(), k, 0);
            for(int i = 0; i < k.length; i++){
                coded[i] = ((int)k[i]);
            }
            int[] decoded = new int[coded.length];
            for (int i = 0; i < coded.length; i++){
                decoded[i] = coded[i]/ (key[i % key.length] - 64) + 128 - key[i % key.length];
            }

            //перевод массива интов в строку

            char[] cdecoded = new char[decoded.length];
            for (int i = 0; i < decoded.length; i++){
                cdecoded[i] = (char)decoded[i];
            }
            String ans = new String(cdecoded);
            return(ans);}
        else {
            return(scoded);
        }
    }
}

