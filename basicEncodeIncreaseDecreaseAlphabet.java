public class basicEncodeIncreaseDecreaseAlphabet {
    /*
        this is basic for how encode decode work #CMIIW
        im using scenario shifting or increase/decrease the alphabet by key
        im use word encode/decode for looks cool, ehe
        for example:
        - I want to increase 2 char of alphabet "a", then the output will be "c"
        - I want to decrease 3 char of alphabet "h", then the output will be "e"
    */
    private static String encodeDecode(String word){
        StringBuilder encode = new StringBuilder();

        int key = 2;            // value for increase or decrease char
        int alphabet = 26;      // number of alphabet

        if (word.contains("<encode>")) {
            String strNew = word.replace("<encode>", "");
            key = key % alphabet;       // if key greater than alphabet, it will return to 1 to 26
            for (char c : strNew.toCharArray()) {
                if (c + key > 122){     // char in java using ASCII, google it
                    c -= alphabet;
                }
                encode.append(c += key);
            }
        }else if (word.contains("<decode>")){
            String strNew = word.replace("<decode>", "");
            key = key % alphabet;
            for (char c : strNew.toCharArray()) {
                if (c - key < 97){
                    c += alphabet;
                }
                encode.append(c -= key);
            }
        }
        return encode.toString();
    }

    public static void main(String[] args) {
        System.out.println(encodeDecode("<encode>abcd")); // cdef
        System.out.println(encodeDecode("<encode>xyz")); // zab

        System.out.println(encodeDecode("<decode>cdef")); // abcd
        System.out.println(encodeDecode("<decode>zab")); // xyz
    }
}